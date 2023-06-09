package _06_vault;

public class vaultRunner {
	public static void main(String[] args) {
		Vault vault = new Vault();
		SecretAgent secretAgent = new SecretAgent();
		System.out.println(secretAgent.findCode(1000001));
	}
}
