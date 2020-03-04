import { Injectable } from '@angular/core';
import{HttpClient} from'@angular/common/http';
import { Branch } from '../Custommodel/Branch.Custommodel';
import { Address } from '../Custommodel/Address.Custommodel';
@Injectable({
  providedIn: 'root'
})
export class BranchserviceService {

  constructor(private http:HttpClient) { }
  url:string="http://localhost:8082";

  postbranchdata(br:Branch)
{
  return this.http.post(this.url+"/addbranch",br)
}
brh:Branch={

  branchId:null,
  branchName:"",
  branchContactNo:"",
  branchEmail:"",
  branchType:{
    branchTypeId:null,
    branchTypeName:"",
    branchTypeCode:""
  },
  company:{
    companyName:""
  },
  address:{
    addressId:null
  }
 }


 getdata()
 {
   return this.http.get(this.url+"/getallbranch")
 }
 updatedata(bra:Branch)
 {
   return this.http.put(this.url+"/"+bra.branchId,bra)
 }
 deletebranchdata(bra:Branch)
 {
   return this.http.delete(this.url+"/"+bra.branchId)
 }



}




