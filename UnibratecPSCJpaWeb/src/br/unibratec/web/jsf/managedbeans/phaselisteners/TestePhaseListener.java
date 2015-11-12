package br.unibratec.web.jsf.managedbeans.phaselisteners;

import java.util.List;

import javax.faces.event.PhaseId;

public class TestePhaseListener {
	
	public static void main(String[] args) {
		List<PhaseId> fases = PhaseId.VALUES;
		for (PhaseId fase : fases) {
			System.out.println(fase.toString());
		}
	}
	
}