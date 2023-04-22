import { Component, OnInit,Input,Output,EventEmitter } from '@angular/core';
import { TASK } from 'src/app/mock-task';
import { Task } from 'src/app/Task';
import 'bootstrap-icons/font/bootstrap-icons.css';

@Component({
  selector: 'app-task-item',
  templateUrl: './task-item.component.html',
  styleUrls: ['./task-item.component.css']
})
export class TaskItemComponent implements OnInit {
  @Input() task : Task = TASK[0];
  @Output() onDeleteTask:EventEmitter<Task> = new EventEmitter();
  @Output() onToggleReminder:EventEmitter<Task> = new EventEmitter();
  
  constructor() { }

  ngOnInit(): void {
  }

  onDelete(task:Task){
    this.onDeleteTask.emit(task);

  }
  onToggle(task:Task){
    this.onToggleReminder.emit(task);
  }
}
