package view;

import br.com.kauanPaulino.ArvoreInt.Arvore;

public class main {

	public static void main(String[] args) {
		int vt[]= {12,4,16,2,8,6};
		Arvore arv = new Arvore();
		for(int i:vt) {
			arv.insert(i);
		}
		try {
			arv.search(6);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
