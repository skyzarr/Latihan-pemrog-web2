<?php
//buat class mobil
class mobil {

   //buat property untuk class mobil
   var $warna;
   var $ukuran_velg;
   var $type_mobil;

   //buat method untuk class mobil
   function hidupkan_mobil(){
    return "hidupkan mobil";
   }
function matikan_mobil(){
    return "matikan mobil";
  }
}
//buat objek dari class mobil (instansiasi)
$mobil_fajar =new mobil();
?>
<?php
//buat class mobil
class mobil{

    //buat prperty untuk class mobil
    var $warna;
    var $ukuran_velg;
    var $type_mobil;
    
    //buat method untuk class mobil
    function hidupkan_mobil(){
        return "hidupkan_mobil";
    }
    function matikan_mobil(){
        return "matikan_mobil";
    }
}
//buat objek dari class mobil (instansiasi)
$mobil_fajar =new mobil();

//set property
$mobil_fajar->warna="hitam";
$mobil_fajar->ukuran_velg="ring 15";
$mobil_fajar->type_mobil="toyota";

//tampilam property
echo $mobil_fajar_warna;
echo $"<br />";
echo $mobil_fajar->ukuran_velg;
echo $"<br />";
echo $mobil_fajar->type_mobil;
echo $"<br />";

//tampilan method
echo $mobil_fajar->hidupkan_mobil();
echo $"<br />";
echo $mobil_fajar->matikan_mobil();
?>
