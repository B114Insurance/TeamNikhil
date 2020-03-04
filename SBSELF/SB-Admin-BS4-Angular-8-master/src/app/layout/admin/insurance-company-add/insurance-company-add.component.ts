import { Component, OnInit } from '@angular/core';
import { insuranceCompany } from 'src/app/Custommodel/insuranceCompany.Custommodel';
import { CompanyserviceService } from 'src/app/sharedservice/companyservice.service';
import { Address } from 'src/app/Custommodel/Address.Custommodel';


@Component({
  selector: 'app-insurance-company-add',
  templateUrl: './insurance-company-add.component.html',
  styleUrls: ['./insurance-company-add.component.scss']
})
export class InsuranceCompanyAddComponent implements OnInit {



  constructor(private s:CompanyserviceService) { }

  ngOnInit() {
  }
  submitdata(comp:insuranceCompany)
{
  this.s.postcompanydata(comp).subscribe();
}

resetdata()
{
  this.s.ic=Object.assign({},null);
}

}
