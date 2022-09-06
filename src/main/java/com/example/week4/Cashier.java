package com.example.week4;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Cashier {
    private ArrayList<Change> c = new ArrayList<Change>(1);;
//    private Change c;


    public Cashier() {
//        c = new ArrayList<>(1);
    }
    @RequestMapping(value = "/getChange/{coin}", method = RequestMethod.GET)
    public Change getChange(@PathVariable("coin") int money){
        ArrayList<Integer> value = new ArrayList();
        value.add(1000);
        value.add(500);
        value.add(100);
        value.add(20);
        value.add(10);
        value.add(5);
        value.add(1);
        ArrayList<Integer> numMoney = new ArrayList();
        int num = 0;
        int remain = 0;

            for (int j=0; j< value.size(); j++){
                num = money/value.get(j);
                remain = money%value.get(j);
                money = remain;
                numMoney.add(num);

            }
            c.add(new  Change(numMoney.get(0), numMoney.get(1), numMoney.get(2), numMoney.get(3), numMoney.get(4), numMoney.get(5), numMoney.get(6)));
//            c.setB1000(numMoney.get(0));
//            c.setB500(numMoney.get(1));
//            c.setB100(numMoney.get(2));
//            c.setB20(numMoney.get(3));
//            c.setB10(numMoney.get(4));
//            c.setB5(numMoney.get(5));
//            c.setB1(numMoney.get(6));

        return c.get(c.size()-1);
    }

}
