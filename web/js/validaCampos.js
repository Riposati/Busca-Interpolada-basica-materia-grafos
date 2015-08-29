/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function validaFormBuscaBinaria() {

    if ((document.getElementById("valor1").value === "")) {
        document.getElementById("valor1_vazio").innerHTML = "<span>Valor 1 obrigatório / Somente números inteiros!</span>";
        document.getElementById("valor1").focus();
        return false;

    } else {
        document.getElementById("valor1_vazio").innerHTML = "";
        if (document.getElementById("valor2").value === "") {
            document.getElementById("valor2_vazio").innerHTML = "<span>Valor 2 obrigatório</span>";
            document.getElementById("valor2").focus();
            return false;
        } else {

            document.getElementById("valor2_vazio").innerHTML = "";
            if (document.getElementById("valor3").value === "") {
                document.getElementById("valor3_vazio").innerHTML = "<span>Valor 3 obrigatório</span>";
                document.getElementById("valor3").focus();
                return false;
            } else {
                document.getElementById("valor3_vazio").innerHTML = "";
                if (document.getElementById("valor4").value === "") {
                    document.getElementById("valor4_vazio").innerHTML = "<span>Valor 4 obrigatório</span>";
                    document.getElementById("valor4").focus();
                    return false;
                } else {

                    document.getElementById("valor4_vazio").innerHTML = "";
                    if (document.getElementById("valor5").value === "") {
                        document.getElementById("valor5_vazio").innerHTML = "<span>Valor 5 obrigatório</span>";
                        document.getElementById("valor5").focus();
                        return false;
                    } else {


                        document.getElementById("valor5_vazio").innerHTML = "";
                        if (document.getElementById("valor6").value === "") {
                            document.getElementById("valor6_vazio").innerHTML = "<span>Valor 6 obrigatório</span>";
                            document.getElementById("valor6").focus();
                            return false;
                        } else {

                            document.getElementById("valor6_vazio").innerHTML = "";
                            if (document.getElementById("valor7").value === "") {
                                document.getElementById("valor7_vazio").innerHTML = "<span>Valor 7 obrigatório</span>";
                                document.getElementById("valor7").focus();
                                return false;
                            } else {

                                return true;

                            }
                        }
                    }

                }
            }
        }
    }




}


