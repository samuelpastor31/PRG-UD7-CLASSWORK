package actividad5;

import java.util.StringTokenizer;

public class Date {
	
	private int dia;
	
	private int mes;
	
	private int anyo;

	private static final String[] DIAS_TEXTO = new String[] { "domingo", "lunes", "martes", "miercoles", "jueves", "viernes", "sabado"};

	private static final String[] MESES_TEXTO = new String[] { "enero", "febrero", "marzo", "abril", "mayo", "junio",
			"julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre" };

	/**
	 *  Constructor por defecto
	 *  Inicializa una fecha a dia 1-1-1
	 */
	public Date() {
		this.dia = 1;
		this.mes = 1;
		this.anyo = 1;
	}

	/**
	 *  Inicializa la fecha a partir de los parámetros recibidos
	 */
	public Date(int dia, int mes, int anyo) {
		this.dia = dia;
		this.mes = mes;
		this.anyo = anyo;
	}

	/**
	 * Crea una fecha a partir de otra fecha pasada como argumento
	 *
	 * Deberemos hacer uso de los métodos consultores para inicializar nuestra clase
	 * @param fecha
	 */
	public Date(Date fecha) {
		this.dia = fecha.getDia();
		this.mes = fecha.getMes();
		this.anyo = fecha.getAnyo();
	}

	/**
	 * Inicializa la fecha a partir de otra pasada en formato String dd/mm/yyyy
	 *
	 * Deberemos trocearlas de forma que asignemos el día més y año a cada uno de los atributoe
	 * @param fecha
	 */
	public Date(String fecha) {
		StringTokenizer stringTokenizer = new StringTokenizer(fecha, "/");
		this.dia = Integer.parseInt(stringTokenizer.nextToken());
		this.mes = Integer.parseInt(stringTokenizer.nextToken());
		this.anyo = Integer.parseInt(stringTokenizer.nextToken());
	}

	/**
	 * Modifica la fecha actual a partir de los datos pasados como argumento
	 */
	public void set(int dia, int mes, int anyo) {
		this.dia = dia;
		this.mes = mes;
		this.anyo = anyo;
	}

	/**
	 * Devuelve el día de la semana que representa por la Fecha actual
	 * @return @dia
	 */
	public int getDia() {
		return this.dia;
	}

	/**
	 * Devuelve el mes que representa la Fecha actual
	 * @return @mes
	 */
	public int getMes(){
		return this.mes;
	}

	/**
	 * Devuelve el año que representa la Fecha actual
	 * @return @mes
	 */
	public int getAnyo(){
		return this.anyo;
	}

	/**
	 * Muestra por pantalla la fecha en formato español dd-mm-yyyy
	 */
	public void mostrarFormatoES()  {
		System.out.printf("%02d-%02d-%04d %n", this.dia, this.mes, this.anyo);
	}

	/**
	 * Muestra por pantalla la fecha en formato inglés yyyy-mm-dd
	 */
	public void mostrarFormatoGB() {
		System.out.printf("%04d-%02d-%02d %n", this.anyo, this.mes, this.dia);
	}

	/**
	 * Muestra por pantalla la fecha en formato texto dd-mmmmm-yyyy
	 */
	public void mostrarFormatoTexto() {
		System.out.printf("%s-%s-%04d %n", this.dia, this.getMesTexto(), this.anyo);
	}

	/**
	 * Retorna un booleano indicando si la fecha del objeto es igual a la fecha pasada como
	 * argumento
	 *
	 * @return boolean
	 */
	public boolean isEqual(Date fecha) {
		return (this.dia == fecha.getDia())
				&& (this.mes == fecha.getMes())
				&& (this.anyo == fecha.getAnyo());
	}

	/**
	 * Retorna el dia correspondiente de la semana en formato String
	 * @return String
	 */
	public String getDiaSemana() {
		int diasTranscurridosOrigen = getDiasTranscurridosOrigen();
		return DIAS_TEXTO[diasTranscurridosOrigen % 7];
	}

	/**
	 * Solo Festivo sábado o domingo
	 * @return boolean
	 */
	public boolean isFestivo() {
		String diaSemana = getDiaSemana();
		return diaSemana.equals("sabado")
				|| diaSemana.equals("domingo");
	}

	/**
	 * El numéro máximo de dias que podemos añadir es 30
	 *
	 * @param numDias
	 * @return
	 */
	public Date anyadir(int numDias) {
			assert numDias < 30;
			int nuevoDia = dia + numDias;
		    int nuevoMes = mes;
		    int nuevoAnyo = anyo;
		    int numDiasMes = getDiasMes(mes, anyo);
		    if (nuevoDia > numDiasMes){
		    	nuevoDia = numDias - (numDiasMes - dia);
				nuevoMes++;
				if (nuevoMes > 12) {
					nuevoMes = 1;
					nuevoAnyo++;
				}
			}
		return new Date(nuevoDia, nuevoMes, nuevoAnyo);
	}

	public Date restar(int numDias){
		int nuevoDia = dia - numDias;
		int nuevoMes = mes;
		int nuevoAnyo = anyo;
		if (nuevoDia <= 0) {
			int numDiasMesAnterior = getDiasMes(mes - 1, anyo);
			nuevoDia = numDiasMesAnterior - (nuevoDia * - 1);
			if (nuevoMes == 1) {
				nuevoMes = 12;
				nuevoAnyo--;
			}
		}
		return new Date(nuevoDia, nuevoMes, nuevoAnyo);
	}

	public boolean isCorrecta(){
		return dia <= getDiasMes(mes, anyo) && (mes >= 1 && mes <= 12);
	}

	/**
	 * Retorna el dia correspondiente de la semana en formato caracter
	 * @return char
	 */
	private String getMesTexto() {
		return MESES_TEXTO[mes - 1];
	}

	/**
	 * Devuelve el número de dias transcurridos desde el 1-1-1
	 *
	 * @return int
	 */
	private int getDiasTranscurridosOrigen() {
		int resultado = this.getDiasTranscurridosAnyo();
		for (int i = 1; i < anyo; i++) {
			resultado += (getDiasAnyo(i)%7);
		}
		return resultado;
	}

	/**
	 * Devuelve el número de dias transcurridos en el anyo actual
	 *
	 * @return int
	 */
	private int getDiasTranscurridosAnyo() {
		int totalDias = dia;
		for (int i = 1; i < mes; i++){
			totalDias += getDiasMes(i, anyo);
		}
		return totalDias;
	}

	/**
	 * Indica si el año pasado como argumento es bisiesto
	 * Un año es bisiesto si es divisible por 4 a su vez 100 por 400
	 *
	 * @return boolean
	 */
	private boolean isBisiesto(int anyo){
		if (anyo % 4 == 0) {
			if (anyo % 100 != 0) {
				return true;
			}
			return (anyo % 400 == 0);
		}
		return false;
	}

	/**
	 *  Calcula el número de días que tiene el mes representado por la fecha actual
	 *
	 *  @return int total dias mes en curso
	 *
	 */
	public int getDiasMes(int mes, int anyo) {
		if( mes == 4 || mes == 6|| mes == 9
				|| mes == 11) {
			return 30;
		}else if (mes == 2){
			return  (isBisiesto(anyo)) ? 29: 28;
		}
		return 31;
	}

	/**
	 * Calcula el número total de dias que tiene el año pasado como argumento
	 *
	 * @return int total dias anyo en curso
	 */
	private int getDiasAnyo(int anyo){
		return (isBisiesto(anyo)) ? 366 : 365;
	}

}
