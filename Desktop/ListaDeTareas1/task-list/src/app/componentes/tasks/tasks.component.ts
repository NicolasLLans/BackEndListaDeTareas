import { Component, Input, OnInit } from '@angular/core';
import { TaskService } from 'src/app/servicios/task.service';
import { Task } from 'src/app/Task';

@Component({
  selector: 'app-tasks',
  templateUrl: './tasks.component.html',
  styleUrls: ['./tasks.component.css']
})
export class TasksComponent implements OnInit {
  tasks: Task[]=[];

  constructor(
    private taskService:TaskService
  ) { }

  ngOnInit(): void {
   this.taskService.getTask().subscribe((tasks)=>{
    this.tasks=tasks;
   });  
  }

}
