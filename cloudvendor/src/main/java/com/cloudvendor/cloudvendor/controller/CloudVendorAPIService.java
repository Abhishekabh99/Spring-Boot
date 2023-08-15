package com.cloudvendor.cloudvendor.controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloudvendor.cloudvendor.model.CloudVendor;

@RestController //thats how spring will know this is a controller class 
@RequestMapping("/cloudvendor") //giving context path 

public class CloudVendorAPIService {
    CloudVendor cloudVendor;
    //creating get req
    @GetMapping("{vendorId}") //thats how spring boot will know this is get req
    public CloudVendor getCloudVendorDetails(String vendorId)
    {
        return cloudVendor;
        // new CloudVendor("C1","vendor 1","Address one","xxx");
    }
    //creating post req
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Created Successfully";
    }
    //creating update request
     @PutMapping
      public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Updated Successfully";
    }
    
    //creating Delete request
     @DeleteMapping("{vendorId}")
      public String deleteCloudVendorDetails(String vendorId)
    {
        this.cloudVendor = null;
        return "Cloud Vendor Deleted Successfully";
    }
}


//MAKING REST API THAT WILL BE SERVING ALL THE 4 CRUD OPERATIONS FOR THIS CLOUDVENDOR
