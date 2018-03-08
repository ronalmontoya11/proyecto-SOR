package bean;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dao.PersonaDao;
import vo.Persona;

@ManagedBean
@SessionScoped
public class TablaBean {

	private Persona miPersona;
	PersonaDao personaDao = new PersonaDao();
	ArrayList<Persona> listaPersonas = new ArrayList<>();
	ArrayList<Persona> listaRequisitos = new ArrayList<>();

	private String nombre;
	private String correo;
	private String documento;
	private String res;

	public TablaBean() {
		miPersona = new Persona();
		consultarLista();
		consultaIndividual();
		GeneralRequisitos();
	}

	public void agregarPersona() {
		System.out.println(nombre + documento + correo);
		setRes(personaDao.agregarPersona(miPersona));
		miPersona = new Persona();
	}

	public void agregar() {

		System.out.println(nombre + documento + correo);

	}

	public String ingresar() {
		res = "";

		System.out.println(miPersona.getContrase() + miPersona.getContra());
		miPersona = personaDao.ingresar(miPersona.getContrase(), miPersona.getContra());

		if (miPersona.getUsuario() == null) {

			System.out.println("Usuario Invalido");

		} else {

			if (miPersona.getUsuario().equals("administrador")) {

				System.out.println("Bienvenido Administrador");

				res = "administrador.jsf";

			} else {
				if (miPersona.getUsuario().equals("aprendiz")) {

					System.out.println("Bienvenido Aprendiz");
					res = "Aprendiz.jsf";

				}
			}

		}
		return res;

	}

	public void consultarLista() {

		listaPersonas.clear();
		listaPersonas = personaDao.obtenerListaPersonas();

	}

	public void eliminarPersona(Persona miPersona) {

		setRes(personaDao.eliminarPersona(miPersona));
		listaPersonas.remove(miPersona);

	}

	public String editarPersona(Persona miPersona) {

		System.out.println("Entro editar");

		miPersona.setEditar(true);

		return "consultar.jsf";

	}

	public void guardarPersona(Persona miPersona) {

		setRes(personaDao.editarPersona(miPersona));

		System.out.println("Entro guardar" + miPersona.getNombre() + miPersona.getCorreo() + miPersona.getDocumento()
				+ miPersona.getUsuario() + miPersona.getContrase());

		System.out.println("" + getRes());

		miPersona.setEditar(false);

	}

	public void consultaIndividual() {

		listaPersonas.clear();
		listaPersonas = personaDao.consultaIndiovidual(miPersona.getDocumento());

	}

	public void registroRequisitos() {

		setRes(personaDao.ingresarRequisito(miPersona));
		miPersona = new Persona();

	}

	public void GeneralRequisitos() {
        listaRequisitos.clear();
		listaRequisitos=personaDao.obtenerListaRequisitos();
		
	}

	public void eliminarRequisitos(Persona mipersona) {

		setRes(personaDao.eliminarRequisito(miPersona));
		listaRequisitos.remove(miPersona);
	}
	
	public void guardarRequisitos(Persona miPersona){
		
		setRes(personaDao.guardarRequisitos(miPersona));
		miPersona.setEditar(false);

		
	}

	public ArrayList<Persona> getListaPersonas() {
		return listaPersonas;
	}

	public void setListaPersonas(ArrayList<Persona> listaPersonas) {
		this.listaPersonas = listaPersonas;
	}

	public Persona getMiPersona() {
		return miPersona;
	}

	public void setMiPersona(Persona miPersona) {
		this.miPersona = miPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getRes() {
		return res;
	}

	public void setRes(String res) {
		this.res = res;
	}

	public ArrayList<Persona> getListaRequisitos() {
		return listaRequisitos;
	}

	public void setListaRequisitos(ArrayList<Persona> listaRequisitos) {
		this.listaRequisitos = listaRequisitos;
	}
}
