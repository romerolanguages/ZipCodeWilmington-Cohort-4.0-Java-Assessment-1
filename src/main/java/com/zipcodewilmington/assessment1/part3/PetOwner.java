package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {

    private String owner;
    private Pet[] petsArray;
    private ArrayList<Pet> petsArrayList;
    private Pet pet;

    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.owner = name;
        this.petsArrayList = new ArrayList<Pet>();

        if (pets != null) {
            for (Pet pet : pets) {
                this.petsArrayList.add(pet);
            }

            this.petsArray = new Pet[this.petsArrayList.size()];
            //this.petsArray = this.petsArrayList.toArray(this.petsArray);

            for (int i = 0; i < this.petsArrayList.size(); i++) {
                this.petsArray[i] = this.petsArrayList.get(i);
            }
        } else {
            this.petsArray = new Pet[0];
        }
//
//        Object[] finalArray = new Object[arrayList.size()];
//        finalArray = arrayList.toArray(finalArray);

    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        this.petsArray = Arrays.copyOf(this.petsArray, this.petsArray.length + 1);
        this.petsArray[this.petsArray.length - 1] = pet;

    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {

        int l = this.petsArray.length;
        int removeAndReplaceIndex = 0;

        for (int i = 0; i < l; i++)  {
            if (this.petsArray[i].equals(pet)) {
                removeAndReplaceIndex = i;
                break;
            }
        }

        for (int i = removeAndReplaceIndex; i < l; i++)  {
            if (i < l - 1) {
                this.petsArray[i] = this.petsArray[i + 1];
            } else if (i == l - 1) {
                this.petsArray[i] = null;
            }
        }

    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {

        boolean answer = false;

        for (int i = 0; i < this.petsArray.length; i++) {
            if (this.petsArray[i].equals(pet)) {
                answer = true;
            }
        }

        return answer;

    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungestPetAge() {

        Arrays.sort(this.petsArray, new Comparator<Pet>() {
            @Override
            public int compare(Pet o1, Pet o2) {
                if (o1.getAge() > o2.getAge()) {
                    return -1; // descending order by age;
                } else if (o1.getAge() == o2.getAge()) {
                    return 0;
                } else {
                    return 1;
                }
            }
        });

        //System.out.println(Arrays.toString(this.petsArray));

        int youngestAge = this.petsArray[this.petsArray.length - 1].getAge();

        return youngestAge;

    }


    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {

        Arrays.sort(this.petsArray, new Comparator<Pet>() {
            @Override
            public int compare(Pet o1, Pet o2) {
                if (o1.getAge() > o2.getAge()) {
                    return -1; // descending order by age;
                } else if (o1.getAge() == o2.getAge()) {
                    return 0;
                } else {
                    return 1;
                }
            }
        });

        //System.out.println(Arrays.toString(this.petsArray));

        int oldestAge = this.petsArray[0].getAge();

        return oldestAge;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {

        float sum = 0;

        for (Pet pet : this.petsArray) {
            sum += pet.getAge();
        }

        int arrayLength = this.petsArray.length;

        float averagePetAge = sum / arrayLength;

        return averagePetAge;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {

        int numberOfPets = this.petsArray.length;
        return numberOfPets;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return this.owner;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {

        return this.petsArray;
    }
}
