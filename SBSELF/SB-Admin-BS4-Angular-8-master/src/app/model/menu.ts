import { InsuranceCompanyAddComponent } from '../layout/admin/insurance-company-add/insurance-company-add.component';
import { insuranceCompany } from '../Custommodel/insuranceCompany.Custommodel';
import { InsuranceCompanyComponent } from '../layout/admin/insurance-company/insurance-company.component';

export class Menu {
    public static menu: Array<any> = [
        {
          ah: [
            { path: 'dashboard', title: 'Dashboard', icon: 'fa fa-fw fa-dashboard', class: 'fa fa-fw fa-dashboard'  },
            { path: 'demo', title: 'Demo', icon: 'fa fa-fw fa-dashboard', class: 'fa fa-fw fa-dashboard'  },
          ],
          oe: [
            { path: 'dashboard', title: 'Dashboard', icon: 'fa fa-fw fa-dashboard', class: 'fa fa-fw fa-dashboard'  },
          ],
          se: [
            { path: 'dashboard', title: 'Dashboard', icon: 'fa fa-fw fa-dashboard', class: 'fa fa-fw fa-dashboard'  },
          ],
          sales: [
            { path: 'dashboard', title: 'Dashboard', icon: 'fa fa-fw fa-dashboard', class: 'fa fa-fw fa-dashboard'  },
          ],
          admin: [
            { path: 'dashboard', title: 'Dashboard', icon: 'fa fa-fw fa-dashboard', class: 'fa fa-fw fa-dashboard'  },
            { path: 'insurancecompany', title: 'company', icon: 'fa fa-fw fa-dashboard', class: 'fa fa-fw fa-dashboard'},
            { path: 'department', title: 'department', icon: 'fa fa-fw fa-dashboard', class: 'fa fa-fw fa-dashboard'  },
            { path: 'Address', title: 'Address', icon: 'fa fa-fw fa-dashboard', class: 'fa fa-fw fa-dashboard'  },
            { path: 'branch', title: 'Branch', icon: 'fa fa-fw fa-dashboard', class: 'fa fa-fw fa-dashboard'  },
            

          ],
        }
      ];
}
