package pl.sdacademy.designPatterns.duck.veterinary;

import java.util.Date;

public class ContactToVet {
    //obiekt Proxy
    private Vet vet;

    public void callVet (){
        System.out.println(new Date());
        if (vet== null){
            vet = new Vet ();
        }
        vet.answerPhone();
        }
    }


