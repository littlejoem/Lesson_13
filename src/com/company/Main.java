package com.company;

    public class Main {

        public static void main(String[] args) {
//            Computer comp = new Computer();
//            comp.i7.start();
//            comp.transend.start();
            new Computer() {
                void sComp () {
                    this.i7.start();
                    this.transend.start();
                }
            };
        }
    }
