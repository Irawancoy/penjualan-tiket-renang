package com.example.penjualantiket.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.penjualantiket.services.penjualanService;

import org.springframework.beans.factory.annotation.Autowired; 


@RestController
@RequestMapping("/penjualan")
public class penjualanController {

   @Autowired
   penjualanService penjualanService;

      // controller tambah penjualan tiket renang dan catat penjualan
      @GetMapping("/tiketRenang")
      public ArrayList<String> tambahPenjualanTiketRenang(
          @RequestParam(value = "nama", defaultValue = "Anonim") String nama,
            @RequestParam(value = "jumlah", defaultValue = "1") int jumlah,
            @RequestParam(value = "harga", defaultValue = "15000") int harga
      ) {
         return penjualanService.tambahPenjualanTiketRenang(nama, jumlah, harga);
      
      }
      

}
