package com.lab;

public class ShippingCalculator {

  public double calculate(double weight, String type) {
    if (weight <= 0) {
      throw new IllegalArgumentException("Weight must be positive");
    }
    // dua hang so len trc equal
    if ("EXPRESS".equals(type)) return weight * 5000 + 20000;
    if ("STANDARD".equals(type)) return weight * 3000;
    if (type.equals("VẬN_CHUYỂN_HỎA_TỐC")) return weight * 10000;
    throw new IllegalArgumentException("Unknown type: " + type);
  }
}

