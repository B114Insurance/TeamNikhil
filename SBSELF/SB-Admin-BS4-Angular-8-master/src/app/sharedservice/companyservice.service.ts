import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { insuranceCompany } from '../Custommodel/insuranceCompany.Custommodel';
import { Address } from '../Custommodel/Address.Custommodel';
@Injectable({
  providedIn: 'root'
})
export class CompanyserviceService {

  constructor(private http:HttpClient) { }

  ic:insuranceCompany={

    companyName:"",
    companyWebsite:"",
    companyEmail:"",
    companyFax:"",
    companyLocation:"",
    companyMobileno:"",
    address:{
      addressId:null,
      buildingNo:"",
      areaName:"",
      city:{
        cityId:null,
        cityName:"",
        cityCode:"",
        state:{
          stateId:null,
          stateName:"",
          stateCode:"",
          country:{
            countryId:null,
            countryName:"",
            countryCode:""
          }
        }

        

      }

    }
  }
  
url:string="http://localhost:8082";


getaddress()
{
  return this.http.get(this.url+"/getaddress");
 
  }


getdata()
{
  return this.http.get(this.url+"/getallcompany");
 
  }
getDepartment()
{
  return this.http.get(this.url+"/getdeptdata")
}
  
postcompanydata(comp:insuranceCompany)
{
  return this.http.post(this.url+"/addcompany",comp)
}


}


 
  
  




