package com.howtoprogram.junit5.Services;

public class Menu {

    public static void main(String[] args) {
        IElection inst = new ElectionImpl();
        String Candidatename = inst.getCandidateNameByParty("Axity");
        int numVotos = inst.getNumberOfVotesByParty("Axity");
        System.out.println(new  StringBuilder().append(Candidatename).append(" ").append(numVotos));
    }
}
