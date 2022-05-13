package dds.monedero.model;

public enum TipoDeMovimiento {

  DEPOSITO{
    @Override
    public double calcularMovimiento(double valorDelMovimiento){
      return valorDelMovimiento;
    }
  },

  EXTRACCION{
    @Override
    public double calcularMovimiento(double valorDelMovimiento){
      return -valorDelMovimiento;
    }

  };
  public abstract double calcularMovimiento(double valorDelMovimiento);
}
