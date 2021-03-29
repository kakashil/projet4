	String identifiant = request.getParameter("identifiant");
	String motDePasse = request.getParameter("motDePasse");
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = (Connection)
	
	DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb",
	"root" ,"");
	
	Statement st= con.createStatement();
	ResultSet rs=st.executeQuery("select * from utilisateurs where
	ident='"+identifiant+"' and pass='"+motDePasse+"' limit 0,1");
	
	if(rs.next())
	{
	out.println("Vous êtes bien connecté "+identifiant);
	}
	else
	{
		out.println("Erreur d'authentification pour
		"+identifiant);
}