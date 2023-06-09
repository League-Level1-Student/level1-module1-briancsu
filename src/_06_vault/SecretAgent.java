package _06_vault;

public class SecretAgent {
	Vault vault = new Vault();
	public int findCode(int num) {
		for(int i = 1; i < num; i ++) {
			if(vault.tryCode(i) == true) {
				return(i);
			}
		}
		return -1;
	}
}
