package com.howtoprogram.junit5.Services;

public class ElectionImpl implements IElection {

    @Override
    public String getCandidateNameByParty(String party) {
        return party.equals("Axity")? "Urbano":"Elmer Homero";
    }

    @Override
    public int getNumberOfVotesByParty(String party) {
        return party.equals("Axity")? 100 : 50;
    }
}
