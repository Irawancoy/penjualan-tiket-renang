package com.example.penjualantiket.services;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class penjualanService {

   // service tambah penjualan tiket renang dan catat penjualan
   public ArrayList<String> tambahPenjualanTiketRenang(
       String nama,
       int jumlah,
       int harga
   ) {
      int total = 0;
      total = jumlah * harga;
      ArrayList<String> response = new ArrayList<String>();
      response.add("Penjualan tiket renang berhasil dicatat");
      response.add("Nama: " + nama);
      response.add("Jumlah: " + jumlah);
      response.add("Harga: " + harga);
      response.add("Total: " + total);
      return response;
   }

}
