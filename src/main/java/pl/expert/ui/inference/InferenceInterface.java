/*
 * The GNU GPL License 
 * Copyright (c) 2015-2016 IT Students of 5th year 
 * at the University of Maria Curie-Sklodowska in Lublin 
 */
package pl.expert.ui.inference;

/**
 *
 * @author rafal16x
 */
public interface InferenceInterface {

    void onClose();
    void onNextRule();
    void startAll();
    void onStop();
    void showSteps();
    
}
