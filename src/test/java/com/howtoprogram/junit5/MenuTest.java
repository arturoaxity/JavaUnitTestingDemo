package com.howtoprogram.junit5;

import com.howtoprogram.junit5.Services.ElectionImpl;
import com.howtoprogram.junit5.Services.ElectionMock;
import com.howtoprogram.junit5.Services.IElection;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

public class MenuTest {
    @Test
    void getCandidateNameByParty(){
        IElection election = new ElectionMock();
        String Candidatename = election.getCandidateNameByParty("Axity");
        int numVotos = election.getNumberOfVotesByParty("Axity");
        assertEquals("prueba",Candidatename);
        assertEquals(10 ,numVotos);

    }

    @Test
    void getCandidateNameByPartyMockito(){
        IElection election =  mock(ElectionImpl.class);
        when(election.getNumberOfVotesByParty("")).thenReturn(0);
        when(election.getCandidateNameByParty("Otra cosa")).thenReturn("Arturo");
        String Candidatename = election.getCandidateNameByParty("Otra cosa");
        int numVotos = election.getNumberOfVotesByParty("");
        assertEquals("Arturo",Candidatename);
        assertEquals(0 ,numVotos);

    }
}
