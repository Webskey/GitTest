package org.webskey.gittest;

import java.util.Comparator;

public class Comparato implements Comparator<Nbp> {

	@Override
	public int compare(Nbp nbp1, Nbp nbp2) {
		return nbp1.getTable().compareTo(nbp2.getTable());
	}

}
