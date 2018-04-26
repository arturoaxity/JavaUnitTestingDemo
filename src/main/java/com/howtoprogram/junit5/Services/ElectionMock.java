package com.howtoprogram.junit5.Services;

public class ElectionMock implements IElection {
    @Override
    public String getCandidateNameByParty(String party) {
        return "prueba";
    }

    @Override
    public int getNumberOfVotesByParty(String party) {
        return 10;
    }
}
