package dds.monedero.model;

public enum TipoDeMovimiento {
  DEPOSITO{

    public double calcularMovimiento(double valorDelMovimiento){
      return valorDelMovimiento;
    }
  },
  EXTRACCION{
    public double calcularMovimiento(double valorDelMovimiento){
      return -valorDelMovimiento;
    }

  }
}
