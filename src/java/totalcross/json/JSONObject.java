package totalcross.json;

import mapped.*;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.Map.Entry;

public class JSONObject {
   private final Map<String, Object> map = new HashMap<String, Object>();
   public static final Object NULL = new Null();

   /**
    * JSONObject.NULL is equivalent to the value that JavaScript calls null,
    * whilst Java's null is equivalent to the value that JavaScript calls
    * undefined.
    */
   private static final class Null {

      /**
       * There is only intended to be a single instance of the NULL object,
       * so the clone method returns itself.
       *
       * @return NULL.
       */
      @Override
      protected final Object clone() {
         return this;
      }

      /**
       * A Null object is equal to the null value and to itself.
       *
       * @param object
       *            An object to test for nullness.
       * @return true if the object parameter is the JSONObject.NULL object or
       *         null.
       */
      @Override
      public boolean equals(Object object) {
         return object == null || object == this;
      }

      /**
       * Get the "null" string value.
       *
       * @return The string "null".
       */
      @Override
      public String toString() {
         return "null";
      }
   }

   public JSONObject() {
   }

   public JSONObject(JSONObject jo, String[] names) {
      this();

      for (int i = 0; i < names.length; i++) {
         try {
            this.putOnce(names[i], jo.opt(names[i]));
         } catch (Exception var7) {
         }
      }
   }

   public JSONObject(JSONTokener var1) throws JSONException {
      this();
      if (var1.nextClean() != '{') {
         throw var1.syntaxError("A JSONObject text must begin with '{'");
      } else {
         while (true) {
            char var4 = var1.nextClean();
            switch (var4) {
               case '\u0000':
                  throw var1.syntaxError("A JSONObject text must end with '}'");
               case '}':
                  return;
            }

            var1.back();
            String var5 = var1.nextValue().toString();
            var4 = var1.nextClean();
            if (var4 != ':') {
               throw var1.syntaxError("Expected a ':' after a key");
            }

            this.putOnce(var5, var1.nextValue());
            switch (var1.nextClean()) {
               case ',':
               case ';':
                  if (var1.nextClean() == '}') {
                     return;
                  }

                  var1.back();
                  break;
               case '}':
                  return;
               default:
                  throw var1.syntaxError("Expected a ',' or '}'");
            }
         }
      }
   }

   public JSONObject(Map<?, ?> var1) {
      if (var1 != null) {
         for (Entry var5 : var1.entrySet()) {
            Object var6 = var5.getValue();
            if (var6 != null) {
               this.map.put(String.valueOf(var5.getKey()), wrap(var6));
            }
         }
      }
   }

   public JSONObject(Object var1) {
      this();
      this.method21799(var1);
   }

   public JSONObject(Object var1, String[] var2) {
      this();
      Class var5 = var1.getClass();

      for (int var6 = 0; var6 < var2.length; var6++) {
         String var7 = var2[var6];

         try {
            this.method21808(var7, var5.getField(var7).get(var1));
         } catch (Exception var9) {
         }
      }
   }

   public JSONObject(String var1) throws JSONException {
      this(new JSONTokener(var1));
   }

   public JSONObject(String var1, Locale var2) throws JSONException2 {
      this();
      ResourceBundle var5 = ResourceBundle.getBundle(var1, var2, Thread.currentThread().getContextClassLoader());
      Enumeration var6 = var5.getKeys();

      while (var6.hasMoreElements()) {
         Object var7 = var6.nextElement();
         if (var7 != null) {
            String[] var8 = ((String)var7).split("\\.");
            int var9 = var8.length - 1;
            JSONObject var10 = this;

            for (int var11 = 0; var11 < var9; var11++) {
               String var12 = var8[var11];
               JSONObject var13 = var10.method21794(var12);
               if (var13 == null) {
                  var13 = new JSONObject();
                  var10.put(var12, var13);
               }

               var10 = var13;
            }

            var10.put(var8[var9], var5.getString((String)var7));
         }
      }
   }

   public JSONObject method21758(String var1, Object var2) throws JSONException2 {
      testValidity(var2);
      Object var5 = this.opt(var1);
      if (var5 != null) {
         if (!(var5 instanceof JSONArray)) {
            this.put(var1, new JSONArray().put(var5).put(var2));
         } else {
            ((JSONArray)var5).put(var2);
         }
      } else {
         this.put(var1, !(var2 instanceof JSONArray) ? var2 : new JSONArray().put(var2));
      }

      return this;
   }

   public JSONObject method21759(String var1, Object var2) throws JSONException2 {
      testValidity(var2);
      Object var5 = this.opt(var1);
      if (var5 != null) {
         if (!(var5 instanceof JSONArray)) {
            throw new JSONException2("JSONObject[" + var1 + "] is not a JSONArray.");
         }

         this.put(var1, ((JSONArray)var5).put(var2));
      } else {
         this.put(var1, new JSONArray().put(var2));
      }

      return this;
   }

   public static String method21760(double var0) {
      if (!Double.isInfinite(var0) && !Double.isNaN(var0)) {
         String var4 = Double.toString(var0);
         if (var4.indexOf(46) > 0 && var4.indexOf(101) < 0 && var4.indexOf(69) < 0) {
            while (var4.endsWith("0")) {
               var4 = var4.substring(0, var4.length() - 1);
            }

            if (var4.endsWith(".")) {
               var4 = var4.substring(0, var4.length() - 1);
            }
         }

         return var4;
      } else {
         return "null";
      }
   }

   public Object getObjectOrThrow(String key) {
      if (key != null) {
         Object value = this.opt(key);
         if (value != null) {
            return value;
         } else {
            throw new JSONException2("JSONObject[" + formatKey(key) + "] not found.");
         }
      } else {
         throw new JSONException2("Null key.");
      }
   }

   public <E extends Enum<E>> E method21762(Class<E> var1, String var2) throws JSONException2 {
      Enum<E> var5 = this.method21783(var1, var2);
      if (var5 != null) {
         return (E)var5;
      } else {
         throw new JSONException2("JSONObject[" + formatKey(var2) + "] is not an enum of type " + formatKey(var1.getSimpleName()) + ".");
      }
   }

   public boolean method21763(String var1) throws JSONException2 {
      Object var4 = this.getObjectOrThrow(var1);
      if (!var4.equals(Boolean.FALSE) && (!(var4 instanceof String) || !((String)var4).equalsIgnoreCase("false"))) {
         if (!var4.equals(Boolean.TRUE) && (!(var4 instanceof String) || !((String)var4).equalsIgnoreCase("true"))) {
            throw new JSONException2("JSONObject[" + formatKey(var1) + "] is not a Boolean.");
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   public BigInteger method21764(String var1) throws JSONException2 {
      Object var4 = this.getObjectOrThrow(var1);

      try {
         return new BigInteger(var4.toString());
      } catch (Exception var6) {
         throw new JSONException2("JSONObject[" + formatKey(var1) + "] could not be converted to BigInteger.");
      }
   }

   public BigDecimal method21765(String var1) throws JSONException2 {
      Object var4 = this.getObjectOrThrow(var1);

      try {
         return new BigDecimal(var4.toString());
      } catch (Exception var6) {
         throw new JSONException2("JSONObject[" + formatKey(var1) + "] could not be converted to BigDecimal.");
      }
   }

   public double method21766(String var1) throws JSONException2 {
      Object var4 = this.getObjectOrThrow(var1);

      try {
         return var4 instanceof Number ? ((Number)var4).doubleValue() : Double.parseDouble((String)var4);
      } catch (Exception var6) {
         throw new JSONException2("JSONObject[" + formatKey(var1) + "] is not a number.");
      }
   }

   public int method21767(String var1) throws JSONException2 {
      Object var4 = this.getObjectOrThrow(var1);

      try {
         return var4 instanceof Number ? ((Number)var4).intValue() : Integer.parseInt((String)var4);
      } catch (Exception var6) {
         throw new JSONException2("JSONObject[" + formatKey(var1) + "] is not an int.");
      }
   }

   public JSONArray getJSONArray(String var1) throws JSONException2 {
      Object var4 = this.getObjectOrThrow(var1);
      if (!(var4 instanceof JSONArray)) {
         throw new JSONException2("JSONObject[" + formatKey(var1) + "] is not a JSONArray.");
      } else {
         return (JSONArray)var4;
      }
   }

   public JSONObject getJsonObject(String key) throws JSONException2 {
      Object value = this.getObjectOrThrow(key);
      if (!(value instanceof JSONObject)) {
         throw new JSONException2("JSONObject[" + formatKey(key) + "] is not a JSONObject.");
      } else {
         return (JSONObject) value;
      }
   }

   public long method21770(String var1) throws JSONException2 {
      Object var4 = this.getObjectOrThrow(var1);

      try {
         return var4 instanceof Number ? ((Number)var4).longValue() : Long.parseLong((String)var4);
      } catch (Exception var6) {
         throw new JSONException2("JSONObject[" + formatKey(var1) + "] is not a long.");
      }
   }

   public static String[] method21771(JSONObject var0) {
      int var3 = var0.method21779();
      if (var3 == 0) {
         return null;
      } else {
         Iterator var4 = var0.method21777();
         String[] var5 = new String[var3];

         for (int var6 = 0; var4.hasNext(); var6++) {
            var5[var6] = (String)var4.next();
         }

         return var5;
      }
   }

   public static String[] method21772(Object var0) {
      if (var0 == null) {
         return null;
      } else {
         Class var3 = var0.getClass();
         Field[] var4 = var3.getFields();
         int var5 = var4.length;
         if (var5 == 0) {
            return null;
         } else {
            String[] var6 = new String[var5];

            for (int var7 = 0; var7 < var5; var7++) {
               var6[var7] = var4[var7].getName();
            }

            return var6;
         }
      }
   }

   public String getString(String var1) throws JSONException2 {
      Object var4 = this.getObjectOrThrow(var1);
      if (!(var4 instanceof String)) {
         throw new JSONException2("JSONObject[" + formatKey(var1) + "] not a string.");
      } else {
         return (String)var4;
      }
   }

   public boolean has(String var1) {
      return this.map.containsKey(var1);
   }

   public JSONObject method21775(String var1) throws JSONException2 {
      Object var4 = this.opt(var1);
      if (var4 != null) {
         if (!(var4 instanceof BigInteger)) {
            if (!(var4 instanceof BigDecimal)) {
               if (!(var4 instanceof Integer)) {
                  if (!(var4 instanceof Long)) {
                     if (!(var4 instanceof Double)) {
                        if (!(var4 instanceof Float)) {
                           throw new JSONException2("Unable to increment [" + formatKey(var1) + "].");
                        }

                        this.method21802(var1, (double)((Float)var4 + 1.0F));
                     } else {
                        this.method21802(var1, (Double)var4 + 1.0);
                     }
                  } else {
                     this.put(var1, (Long)var4 + 1L);
                  }
               } else {
                  this.put(var1, (Integer)var4 + 1);
               }
            } else {
               this.put(var1, ((BigDecimal)var4).add(BigDecimal.ONE));
            }
         } else {
            this.put(var1, ((BigInteger)var4).add(BigInteger.ONE));
         }
      } else {
         this.put(var1, 1);
      }

      return this;
   }

   public boolean method21776(String var1) {
      return NULL.equals(this.opt(var1));
   }

   public Iterator<String> method21777() {
      return this.method21778().iterator();
   }

   public Set<String> method21778() {
      return this.map.keySet();
   }

   public int method21779() {
      return this.map.size();
   }

   public JSONArray method21780() {
      JSONArray var3 = new JSONArray();
      Iterator var4 = this.method21777();

      while (var4.hasNext()) {
         var3.put(var4.next());
      }

      return var3.length() != 0 ? var3 : null;
   }

   public static String method21781(Number var0) throws JSONException2 {
      if (var0 == null) {
         throw new JSONException2("Null pointer");
      } else {
         testValidity(var0);
         String var3 = var0.toString();
         if (var3.indexOf(46) > 0 && var3.indexOf(101) < 0 && var3.indexOf(69) < 0) {
            while (var3.endsWith("0")) {
               var3 = var3.substring(0, var3.length() - 1);
            }

            if (var3.endsWith(".")) {
               var3 = var3.substring(0, var3.length() - 1);
            }
         }

         return var3;
      }
   }

   public Object opt(String var1) {
      return var1 != null ? this.map.get(var1) : null;
   }

   public <E extends Enum<E>> E method21783(Class<E> var1, String var2) {
      return this.<E>method21784(var1, var2, null);
   }

   public <E extends Enum<E>> E method21784(Class<E> var1, String var2, E var3) {
      try {
         Object var6 = this.opt(var2);
         if (NULL.equals(var6)) {
            return (E)var3;
         } else {
            return (E)(var1.isAssignableFrom(var6.getClass()) ? var6 : Enum.<E>valueOf(var1, var6.toString()));
         }
      } catch (NullPointerException | IllegalArgumentException var8) {
         return (E)var3;
      }
   }

   public boolean method21785(String var1) {
      return this.method21786(var1, false);
   }

   public boolean method21786(String var1, boolean var2) {
      try {
         return this.method21763(var1);
      } catch (Exception var6) {
         return var2;
      }
   }

   public double method21787(String var1) {
      return this.method21790(var1, Double.NaN);
   }

   public BigInteger method21788(String var1, BigInteger var2) {
      try {
         return this.method21764(var1);
      } catch (Exception var6) {
         return var2;
      }
   }

   public BigDecimal method21789(String var1, BigDecimal var2) {
      try {
         return this.method21765(var1);
      } catch (Exception var6) {
         return var2;
      }
   }

   public double method21790(String var1, double var2) {
      try {
         return this.method21766(var1);
      } catch (Exception var7) {
         return var2;
      }
   }

   public int method21791(String var1) {
      return this.method21792(var1, 0);
   }

   public int method21792(String var1, int var2) {
      try {
         return this.method21767(var1);
      } catch (Exception var6) {
         return var2;
      }
   }

   public JSONArray method21793(String var1) {
      Object var4 = this.opt(var1);
      return !(var4 instanceof JSONArray) ? null : (JSONArray)var4;
   }

   public JSONObject method21794(String var1) {
      Object var4 = this.opt(var1);
      return !(var4 instanceof JSONObject) ? null : (JSONObject)var4;
   }

   public long method21795(String var1) {
      return this.method21796(var1, 0L);
   }

   public long method21796(String var1, long var2) {
      try {
         return this.method21770(var1);
      } catch (Exception var7) {
         return var2;
      }
   }

   public String method21797(String var1) {
      return this.method21798(var1, "");
   }

   public String method21798(String var1, String var2) {
      Object var5 = this.opt(var1);
      return ! NULL.equals(var5) ? var5.toString() : var2;
   }

   private void method21799(Object var1) {
      Class var4 = var1.getClass();
      boolean var5 = var4.getClassLoader() != null;
      Method[] var6 = var5 ? var4.getMethods() : var4.getDeclaredMethods();

      for (int var7 = 0; var7 < var6.length; var7++) {
         try {
            Method var8 = var6[var7];
            if (Modifier.isPublic(var8.getModifiers())) {
               String var9 = var8.getName();
               String var10 = "";
               if (var9.startsWith("get")) {
                  if (!"getClass".equals(var9) && !"getDeclaringClass".equals(var9)) {
                     var10 = var9.substring(3);
                  } else {
                     var10 = "";
                  }
               } else if (var9.startsWith("is")) {
                  var10 = var9.substring(2);
               }

               if (var10.length() > 0 && Character.isUpperCase(var10.charAt(0)) && var8.getParameterTypes().length == 0) {
                  if (var10.length() == 1) {
                     var10 = var10.toLowerCase();
                  } else if (!Character.isUpperCase(var10.charAt(1))) {
                     var10 = var10.substring(0, 1).toLowerCase() + var10.substring(1);
                  }

                  Object var11 = var8.invoke(var1, (Object[])null);
                  if (var11 != null) {
                     this.map.put(var10, wrap(var11));
                  }
               }
            }
         } catch (Exception var12) {
         }
      }
   }

   public JSONObject method21800(String var1, boolean var2) {
      this.put(var1, !var2 ? Boolean.FALSE : Boolean.TRUE);
      return this;
   }

   public JSONObject method21801(String var1, Collection<?> var2) {
      this.put(var1, new JSONArray(var2));
      return this;
   }

   public JSONObject method21802(String var1, double var2) {
      this.put(var1, new Double(var2));
      return this;
   }

   public JSONObject put(String key, int value) {
      this.put(key, new Integer(value));
      return this;
   }

   public JSONObject put(String key, long value) {
      this.put(key, new Long(value));
      return this;
   }

   public JSONObject method21805(String var1, Map<?, ?> var2) throws JSONException2 {
      this.put(var1, new JSONObject(var2));
      return this;
   }

   public JSONObject put(String key, Object object) {
      if (key != null) {
         if (object == null) {
            this.remove(key);
         } else {
            testValidity(object);
            this.map.put(key, object);
         }

         return this;
      } else {
         throw new NullPointerException("Null key.");
      }
   }

   public JSONObject putOnce(String var1, Object var2) throws JSONException2 {
      if (var1 != null && var2 != null) {
         if (this.opt(var1) != null) {
            throw new JSONException2("Duplicate key \"" + var1 + "\"");
         }

         this.put(var1, var2);
      }

      return this;
   }

   public JSONObject method21808(String var1, Object var2) throws JSONException2 {
      if (var1 != null && var2 != null) {
         this.put(var1, var2);
      }

      return this;
   }

   public static String formatKey(String key) {
      StringWriter writer = new StringWriter();
      synchronized (writer.getBuffer()) {
         try {
            return writeJsonString(key, writer).toString();
         } catch (IOException e) {
            return "";
         }
      }
   }

   public static Writer writeJsonString(String input, Writer writer) throws IOException {
      if (input != null && !input.isEmpty()) {
         char previousChar = 0;
         int length = input.length();
         writer.write(34); // Write the opening quote

         for (int i = 0; i < length; i++) {
            char currentChar = previousChar;
            previousChar = input.charAt(i);
            switch (previousChar) {
               case '\b':
                  writer.write("\\b");
                  break;
               case '\t':
                  writer.write("\\t");
                  break;
               case '\n':
                  writer.write("\\n");
                  break;
               case '\f':
                  writer.write("\\f");
                  break;
               case '\r':
                  writer.write("\\r");
                  break;
               case '"':
               case '\\':
                  writer.write(92); // Write backslash
                  writer.write(previousChar);
                  break;
               case '/':
                  if (currentChar == '<') {
                     writer.write(92); // Write backslash
                  }
                  writer.write(previousChar);
                  break;
               default:
                  if (previousChar >= ' ' && (previousChar < 128 || previousChar >= 160) && (previousChar < 8192 || previousChar >= 8448)) {
                     writer.write(previousChar);
                  } else {
                     writer.write("\\u");
                     String hex = Integer.toHexString(previousChar);
                     writer.write("0000", 0, 4 - hex.length());
                     writer.write(hex);
                  }
            }
         }

         writer.write(34); // Write the closing quote
         return writer;
      } else {
         writer.write("\"\""); // Write empty string if input is null or empty
         return writer;
      }
   }

   public Object remove(String var1) {
      return this.map.remove(var1);
   }

   public boolean method21812(Object var1) {
      try {
         if (!(var1 instanceof JSONObject)) {
            return false;
         } else {
            Set<String> var4 = this.method21778();
            if (!var4.equals(((JSONObject)var1).method21778())) {
               return false;
            } else {
               for (String var6 : var4) {
                  Object var7 = this.getObjectOrThrow(var6);
                  Object var8 = ((JSONObject)var1).getObjectOrThrow(var6);
                  if (var7 instanceof JSONObject) {
                     if (!((JSONObject)var7).method21812(var8)) {
                        return false;
                     }
                  } else if (var7 instanceof JSONArray) {
                     if (!((JSONArray)var7).method9167(var8)) {
                        return false;
                     }
                  } else if (!var7.equals(var8)) {
                     return false;
                  }
               }

               return true;
            }
         }
      } catch (Throwable var9) {
         return false;
      }
   }

   public static Object method21813(String var0) {
      if (var0.equals("")) {
         return var0;
      } else if (var0.equalsIgnoreCase("true")) {
         return Boolean.TRUE;
      } else if (var0.equalsIgnoreCase("false")) {
         return Boolean.FALSE;
      } else if (var0.equalsIgnoreCase("null")) {
         return NULL;
      } else {
         char var3 = var0.charAt(0);
         if (var3 >= '0' && var3 <= '9' || var3 == '-') {
            try {
               if (var0.indexOf(46) <= -1 && var0.indexOf(101) <= -1 && var0.indexOf(69) <= -1) {
                  Long var5 = new Long(var0);
                  if (var0.equals(var5.toString())) {
                     if (var5 == (long)var5.intValue()) {
                        return var5.intValue();
                     }

                     return var5;
                  }
               } else {
                  Double var4 = Double.valueOf(var0);
                  if (!var4.isInfinite() && !var4.isNaN()) {
                     return var4;
                  }
               }
            } catch (Exception var6) {
            }
         }

         return var0;
      }
   }

   public static void testValidity(Object var0) {
      if (var0 != null) {
         if (!(var0 instanceof Double)) {
            if (var0 instanceof Float && (((Float)var0).isInfinite() || ((Float)var0).isNaN())) {
               throw new JSONException2("JSON does not allow non-finite numbers.");
            }
         } else if (((Double)var0).isInfinite() || ((Double)var0).isNaN()) {
            throw new JSONException2("JSON does not allow non-finite numbers.");
         }
      }
   }

   public JSONArray method21815(JSONArray var1) throws JSONException {
      if (var1 != null && var1.length() != 0) {
         JSONArray var4 = new JSONArray();

         for (int var5 = 0; var5 < var1.length(); var5++) {
            var4.put(this.opt(var1.getString(var5)));
         }

         return var4;
      } else {
         return null;
      }
   }

   @Override
   public String toString() {
      try {
         return this.toString(0);
      } catch (Exception var4) {
         return null;
      }
   }

   public String toString(int var1) throws JSONException2 {
      StringWriter var4 = new StringWriter();
      synchronized (var4.getBuffer()) {
         return this.method21821(var4, var1, 0).toString();
      }
   }

   public static String method21816(Object var0) throws JSONException {
      if (var0 == null || var0.equals(null)) {
         return "null";
      } else if (var0 instanceof Class9093) {
         String var7;
         try {
            var7 = ((Class9093)var0).method33920();
         } catch (Exception var5) {
            throw new JSONException2(var5);
         }

         if (var7 instanceof String) {
            return var7;
         } else {
            throw new JSONException2("Bad value from toJSONString: " + var7);
         }
      } else if (var0 instanceof Number) {
         return method21781((Number)var0);
      } else if (var0 instanceof Boolean || var0 instanceof JSONObject || var0 instanceof JSONArray) {
         return var0.toString();
      } else if (var0 instanceof Map) {
         Map var6 = (Map)var0;
         return new JSONObject(var6).toString();
      } else if (var0 instanceof Collection) {
         Collection var3 = (Collection)var0;
         return new JSONArray(var3).toString();
      } else {
         return var0.getClass().isArray() ? new JSONArray(var0).toString() : formatKey(var0.toString());
      }
   }

   public static Object wrap(Object var0) {
      try {
         if (var0 == null) {
            return NULL;
         } else if (var0 instanceof JSONObject
                 || var0 instanceof JSONArray
                 || NULL.equals(var0)
                 || var0 instanceof Class9093
                 || var0 instanceof Byte
                 || var0 instanceof Character
                 || var0 instanceof Short
                 || var0 instanceof Integer
                 || var0 instanceof Long
                 || var0 instanceof Boolean
                 || var0 instanceof Float
                 || var0 instanceof Double
                 || var0 instanceof String
                 || var0 instanceof BigInteger
                 || var0 instanceof BigDecimal) {
            return var0;
         } else if (var0 instanceof Collection) {
            Collection var7 = (Collection)var0;
            return new JSONArray(var7);
         } else if (var0.getClass().isArray()) {
            return new JSONArray(var0);
         } else if (var0 instanceof Map) {
            Map var6 = (Map)var0;
            return new JSONObject(var6);
         } else {
            Package var3 = var0.getClass().getPackage();
            String var4 = var3 != null ? var3.getName() : "";
            return !var4.startsWith("java.") && !var4.startsWith("javax.") && var0.getClass().getClassLoader() != null ? new JSONObject(var0) : var0.toString();
         }
      } catch (Exception var5) {
         return null;
      }
   }

   public Writer method21818(Writer var1) throws JSONException2 {
      return this.method21821(var1, 0, 0);
   }

   public static final Writer method21819(Writer var0, Object var1, int var2, int var3) throws JSONException2, IOException {
      if (var1 == null || var1.equals(null)) {
         var0.write("null");
      } else if (var1 instanceof JSONObject) {
         ((JSONObject)var1).method21821(var0, var2, var3);
      } else if (var1 instanceof JSONArray) {
         ((JSONArray)var1).method9170(var0, var2, var3);
      } else if (var1 instanceof Map) {
         Map var6 = (Map)var1;
         new JSONObject(var6).method21821(var0, var2, var3);
      } else if (var1 instanceof Collection) {
         Collection var9 = (Collection)var1;
         new JSONArray(var9).method9170(var0, var2, var3);
      } else if (var1.getClass().isArray()) {
         new JSONArray(var1).method9170(var0, var2, var3);
      } else if (var1 instanceof Number) {
         var0.write(method21781((Number)var1));
      } else if (var1 instanceof Boolean) {
         var0.write(var1.toString());
      } else if (var1 instanceof Class9093) {
         String var10;
         try {
            var10 = ((Class9093)var1).method33920();
         } catch (Exception var8) {
            throw new JSONException2(var8);
         }

         var0.write(var10 != null ? var10.toString() : formatKey(var1.toString()));
      } else {
         writeJsonString(var1.toString(), var0);
      }

      return var0;
   }

   public static final void method21820(Writer var0, int var1) throws IOException {
      for (int var4 = 0; var4 < var1; var4++) {
         var0.write(32);
      }
   }

   public Writer method21821(Writer var1, int var2, int var3) throws JSONException2 {
      try {
         boolean var6 = false;
         int var7 = this.method21779();
         Iterator var8 = this.method21777();
         var1.write(123);
         if (var7 == 1) {
            Object var9 = var8.next();
            var1.write(formatKey(var9.toString()));
            var1.write(58);
            if (var2 > 0) {
               var1.write(32);
            }

            method21819(var1, this.map.get(var9), var2, var3);
         } else if (var7 != 0) {
            for (int var12 = var3 + var2; var8.hasNext(); var6 = true) {
               Object var10 = var8.next();
               if (var6) {
                  var1.write(44);
               }

               if (var2 > 0) {
                  var1.write(10);
               }

               method21820(var1, var12);
               var1.write(formatKey(var10.toString()));
               var1.write(58);
               if (var2 > 0) {
                  var1.write(32);
               }

               method21819(var1, this.map.get(var10), var2, var12);
            }

            if (var2 > 0) {
               var1.write(10);
            }

            method21820(var1, var3);
         }

         var1.write(125);
         return var1;
      } catch (IOException var11) {
         throw new JSONException2(var11);
      }
   }
}