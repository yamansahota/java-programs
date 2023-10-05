class awt {
	public static void main(String a[]) {
		java.awt.Frame f1 = new java.awt.Frame();

		f1.setSize(1080, 1920);
		f1.setVisible(true);
		f1.setTitle("New Program Using AWT");

		java.awt.Button b1 = new java.awt.Button("Okkk");
		java.awt.Button b2 = new java.awt.Button("Click Me");
		java.awt.FlowLayout f = new java.awt.FlowLayout();
		f1.add(b1);
		f1.add(b2);
		f1.setLayout(f);
		f1.setResizable(false);
	}
}