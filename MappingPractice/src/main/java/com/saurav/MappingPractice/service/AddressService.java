package com.saurav.MappingPractice.service;

import com.saurav.MappingPractice.model.Address;
import com.saurav.MappingPractice.model.Student;
import com.saurav.MappingPractice.repository.IAddressRepo;
import com.saurav.MappingPractice.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;
    @Autowired
    IStudentRepo studentRepo;

    public String addAddress(Address address) {
        if(address != null){
            addressRepo.save(address);
            return "Address saved in our database";
        }
        return "Not saved Error occurred";
    }

    public List<Address> getAddress() {
        return addressRepo.findAll();
    }

    public Address getAddressByStudentID(Integer studentID) {
        boolean isExistStudentID = studentRepo.existsById(studentID);
        if(isExistStudentID){
            Optional<Student> student = studentRepo.findById(studentID);
            Address address = addressRepo.findFirstByStudent(student);
            return  address;
        }
        return null;
    }

    public String updateAddressByAddressID(Long addressID, Address address) {
        if(addressRepo.existsById(addressID)){
            Address oldAddress = addressRepo.findFirstByAddressID(addressID);
            oldAddress.setAddressLandmark(address.getAddressLandmark());
            oldAddress.setAddressZipcode(address.getAddressZipcode());
            oldAddress.setAddressDistrict(address.getAddressDistrict());
            oldAddress.setAddressState(address.getAddressState());
            oldAddress.setAddressCountry(address.getAddressCountry());
            addressRepo.save(oldAddress);
            return "address Updated successfull";
        }
        return "This address ID "+addressID+" is Invalid please enter valid address ID";
    }

    public String deleteAddressByAddressID(Long addressID) {
        if(addressRepo.existsById(addressID)){
            addressRepo.deleteById(addressID);
            return "Id of this " +addressID+ " address deleted from our database";
        }
        return "Please Enter valid address ID";
    }
}
