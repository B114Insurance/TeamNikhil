import { Component, OnInit } from '@angular/core';
import { CompanyserviceService } from 'src/app/sharedservice/companyservice.service';

@Component({
  selector: 'app-department',
  templateUrl: './department.component.html',
  styleUrls: ['./department.component.scss']
})
export class DepartmentComponent implements OnInit {

  constructor(private s:CompanyserviceService) { }
 dept:DepartmentComponent[];
  ngOnInit() {
    this.s.getDepartment().subscribe((data:DepartmentComponent[])=>{this.dept=data})

  }

}
