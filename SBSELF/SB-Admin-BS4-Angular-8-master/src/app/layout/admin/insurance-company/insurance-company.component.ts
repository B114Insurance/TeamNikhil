import { Component, OnInit } from '@angular/core';
import { CompanyserviceService } from 'src/app/sharedservice/companyservice.service';
import { insuranceCompany } from 'src/app/Custommodel/insuranceCompany.Custommodel';

@Component({
  selector: 'app-insurance-company',
  templateUrl: './insurance-company.component.html',
  styleUrls: ['./insurance-company.component.scss']
})
export class InsuranceCompanyComponent implements OnInit {

 

  constructor(private s:CompanyserviceService) { }
 comp:insuranceCompany[];

  ngOnInit() {
    this.s.getdata().subscribe((data:insuranceCompany[])=>{this.comp=data})
  }

}
