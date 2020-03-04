import { Component, OnInit } from '@angular/core';
import { CompanyserviceService } from 'src/app/sharedservice/companyservice.service';
import { Address } from 'src/app/Custommodel/Address.Custommodel';

@Component({
  selector: 'app-address',
  templateUrl: './address.component.html',
  styleUrls: ['./address.component.scss']
})
export class AddressComponent implements OnInit {

  constructor(private s:CompanyserviceService) { }
 add:Address[];
  ngOnInit() {
this.s.getaddress().subscribe((data:Address[])=>{this.add=data})


  }
  

}
