import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../../services/customer.service';
import { ProductCatalogService } from 'src/app/services/product-catalog.service';

@Component({
    selector: 'app-landing',
    templateUrl: './landing.component.html',
    styleUrls: ['./landing.component.scss']
})

export class LandingComponent implements OnInit {
  focus: any;
  focus1: any;

  constructor(private customerService: CustomerService, private productCatelogService: ProductCatalogService) {
    // this.customerService.getCustomers().subscribe(res => {
    //     console.log("Test Result: ", res);
        
    // });

    this.productCatelogService.getProductCatalogs().subscribe(res => {
         console.log("Test Result: ", res);
    });
   }

  ngOnInit() {}

}
