package com.n.minimi;

public class Pet {
    //nutrition should have overweight along with normal
    //activity is fixed;

    private double sleep;
    public enum SleepState {
        RESTED,NORMAL,TIRED;
    }
    public SleepState sleepstate;


    private double hunger;
    public enum HungerState {
        SKINNY,NORMAL,FAT;
    }
    public HungerState hungerstate;

    private double fitness;
    public enum FitnessState {
        UNFIT,NORMAL,FIT;
    }
    public FitnessState fitnessstate;

    private double stress;

    private double social;

    Pet(double calories){
        this.hunger = calories;
        this.sleep = 420;
        this.fitness = 30;
    }

    public void eat(Food food){
        hunger = hunger - food.getCal();
        if(hunger < -150){
            hungerstate = HungerState.FAT;
        }else if(hunger>150){
            hungerstate = HungerState.SKINNY;
        }else{
            hungerstate = HungerState.NORMAL;
        }
    }

    public void sleep(double start, double end){
        sleep = sleep - (end-start);
        if(sleep>60){
            sleepstate = SleepState.TIRED;
        }else if(sleep<-30){
            sleepstate = SleepState.RESTED;
        }else{
            sleepstate = SleepState.NORMAL;
        }
    }

    public void exercise(double start, double end){
        fitness = fitness - (end-start);
        if(fitness>30){
            fitnessstate = FitnessState.UNFIT;
        }else if(fitness<-20){
            fitnessstate = FitnessState.FIT;
        }else{
            fitnessstate = FitnessState.NORMAL;
        }
    }

}
