package com.example.demo.service.serviceImpl;

import com.example.demo.ODT.Messenger;
import com.example.demo.entity.TypeProduct;
import com.example.demo.repositories.TypeProductCarRepository;
import com.example.demo.service.TypeProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TypeProductCarImpl  implements TypeProductService {

    @Autowired
    TypeProductCarRepository typeProductCarRepository;
    @Autowired
    Messenger messenger;
    @Override
    public ResponseEntity<?> put(TypeProduct typeProduct) {
        // Kiểm tra xem TypeProductCar với cùng một tên đã tồn tại chưa
        if ( typeProductCarRepository.findByNameType(typeProduct.getNameType()) != null ) {
            messenger.setMessenger("TypeProductCar with the same name already exists.");
            return new ResponseEntity<>(messenger, HttpStatus.CONFLICT);
        }
        // Nếu không có tên trùng lặp, lưu TypeProductCar
        return new ResponseEntity<>(typeProductCarRepository.save(typeProduct), HttpStatus.OK);
    }
}
