package br.com.devsource.gs1;

/**
 * @author guilherme.pacheco
 */

 //A list of possible AI Definitions defined in the spec is available on
 //https://www.gs1.org/sites/default/files/docs/barcodes/GS1_General_Specifications.pdf p133
 //The code is based on https://www.databar-barcode.info/application-identifiers/ 
public enum AIs implements AI {

  SSCC("00", "SSCC", "Serial Shipping Container Code", "n2+n18"),
  GTIN("01", "GTIN", "Global Trade Item Nr", "n2+n14"),
  CONTENT("02", "CONTENT", "Identification of trade items contained in a logistic unit", "n2+n14"),
  BATCH_LOT("10", "BATCH/LOT", "Batch number", "n2+an..20"),
  PROD_DATE("11", "PROD DATE", "Production date", "n2+n6"),
  DUE_DATE("12", "DUE DATE", "Due date", "n2+n6"),
  PACK_DATE("13", "PACK DATE", "Packaging date", "n2+n6"),
  BEST_BEFORE("15", "BEST BEFORE or SELL BY", "Best before date", "n2+n6"),
  EXPIRY("17", "USE BY or EXPIRY", "Expiration date", "n2+n6"),
  VARIANT("20", "VARIANT", "Product variation", "n2+n2"),
  SERIAL("21", "SERIAL", "Serial Number", "n2+an..20"),
  QTY_DATE_BATCH("22", "QTY / DATE / BATCH", "Consumer product variation - healthcare specific", "n2+an..29");

  private String code;
  private String title;
  private String description;
  private String format;

  private AIs(String code, String title, String description, String format) {
    this.code = code;
    this.title = title;
    this.description = description;
    this.format = format;
  }

  @Override
  public String getCode() {
    return code;
  }

  @Override
  public String getTitle() {
    return title;
  }

  @Override
  public String getDescription() {
    return description;
  }

  @Override
  public String getFormat() {
    return format;
  }

  @Override
  public String toString() {
    return description;
  }

}
