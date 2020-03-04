import { Address } from './Address.Custommodel';
import { BranchType } from './BranchType.Custommodel';
import { insuranceCompany } from './insuranceCompany.Custommodel';

export class Branch{

    branchId:number;
    branchName:string;
    branchContactNo:string;
    branchEmail:string;
    address:{
        addressId:number;
          
     }
    company:{
        companyName:string;
            
    }
    branchType:{
        branchTypeId:number;
        branchTypeName:string;
    branchTypeCode:string;
    }
    


}