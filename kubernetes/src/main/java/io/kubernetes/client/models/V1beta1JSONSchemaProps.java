/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.8.4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.models.V1beta1ExternalDocumentation;
import io.kubernetes.client.models.V1beta1JSON;
import io.kubernetes.client.models.V1beta1JSONSchemaProps;
import io.kubernetes.client.models.V1beta1JSONSchemaPropsOrArray;
import io.kubernetes.client.models.V1beta1JSONSchemaPropsOrBool;
import io.kubernetes.client.models.V1beta1JSONSchemaPropsOrStringArray;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * JSONSchemaProps is a JSON-Schema following Specification Draft 4 (http://json-schema.org/).
 */
@ApiModel(description = "JSONSchemaProps is a JSON-Schema following Specification Draft 4 (http://json-schema.org/).")

public class V1beta1JSONSchemaProps {
  @SerializedName("$ref")
  private String ref = null;

  @SerializedName("$schema")
  private String schema = null;

  @SerializedName("additionalItems")
  private V1beta1JSONSchemaPropsOrBool additionalItems = null;

  @SerializedName("additionalProperties")
  private V1beta1JSONSchemaPropsOrBool additionalProperties = null;

  @SerializedName("allOf")
  private List<V1beta1JSONSchemaProps> allOf = null;

  @SerializedName("anyOf")
  private List<V1beta1JSONSchemaProps> anyOf = null;

  @SerializedName("default")
  private V1beta1JSON _default = null;

  @SerializedName("definitions")
  private Map<String, V1beta1JSONSchemaProps> definitions = null;

  @SerializedName("dependencies")
  private Map<String, V1beta1JSONSchemaPropsOrStringArray> dependencies = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("enum")
  private List<V1beta1JSON> _enum = null;

  @SerializedName("example")
  private V1beta1JSON example = null;

  @SerializedName("exclusiveMaximum")
  private Boolean exclusiveMaximum = null;

  @SerializedName("exclusiveMinimum")
  private Boolean exclusiveMinimum = null;

  @SerializedName("externalDocs")
  private V1beta1ExternalDocumentation externalDocs = null;

  @SerializedName("format")
  private String format = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("items")
  private V1beta1JSONSchemaPropsOrArray items = null;

  @SerializedName("maxItems")
  private Long maxItems = null;

  @SerializedName("maxLength")
  private Long maxLength = null;

  @SerializedName("maxProperties")
  private Long maxProperties = null;

  @SerializedName("maximum")
  private Double maximum = null;

  @SerializedName("minItems")
  private Long minItems = null;

  @SerializedName("minLength")
  private Long minLength = null;

  @SerializedName("minProperties")
  private Long minProperties = null;

  @SerializedName("minimum")
  private Double minimum = null;

  @SerializedName("multipleOf")
  private Double multipleOf = null;

  @SerializedName("not")
  private V1beta1JSONSchemaProps not = null;

  @SerializedName("oneOf")
  private List<V1beta1JSONSchemaProps> oneOf = null;

  @SerializedName("pattern")
  private String pattern = null;

  @SerializedName("patternProperties")
  private Map<String, V1beta1JSONSchemaProps> patternProperties = null;

  @SerializedName("properties")
  private Map<String, V1beta1JSONSchemaProps> properties = null;

  @SerializedName("required")
  private List<String> required = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("uniqueItems")
  private Boolean uniqueItems = null;

  public V1beta1JSONSchemaProps ref(String ref) {
    this.ref = ref;
    return this;
  }

   /**
   * Get ref
   * @return ref
  **/
  @ApiModelProperty(value = "")
  public String getRef() {
    return ref;
  }

  public void setRef(String ref) {
    this.ref = ref;
  }

  public V1beta1JSONSchemaProps schema(String schema) {
    this.schema = schema;
    return this;
  }

   /**
   * Get schema
   * @return schema
  **/
  @ApiModelProperty(value = "")
  public String getSchema() {
    return schema;
  }

  public void setSchema(String schema) {
    this.schema = schema;
  }

  public V1beta1JSONSchemaProps additionalItems(V1beta1JSONSchemaPropsOrBool additionalItems) {
    this.additionalItems = additionalItems;
    return this;
  }

   /**
   * Get additionalItems
   * @return additionalItems
  **/
  @ApiModelProperty(value = "")
  public V1beta1JSONSchemaPropsOrBool getAdditionalItems() {
    return additionalItems;
  }

  public void setAdditionalItems(V1beta1JSONSchemaPropsOrBool additionalItems) {
    this.additionalItems = additionalItems;
  }

  public V1beta1JSONSchemaProps additionalProperties(V1beta1JSONSchemaPropsOrBool additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

   /**
   * Get additionalProperties
   * @return additionalProperties
  **/
  @ApiModelProperty(value = "")
  public V1beta1JSONSchemaPropsOrBool getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(V1beta1JSONSchemaPropsOrBool additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  public V1beta1JSONSchemaProps allOf(List<V1beta1JSONSchemaProps> allOf) {
    this.allOf = allOf;
    return this;
  }

  public V1beta1JSONSchemaProps addAllOfItem(V1beta1JSONSchemaProps allOfItem) {
    if (this.allOf == null) {
      this.allOf = new ArrayList<V1beta1JSONSchemaProps>();
    }
    this.allOf.add(allOfItem);
    return this;
  }

   /**
   * Get allOf
   * @return allOf
  **/
  @ApiModelProperty(value = "")
  public List<V1beta1JSONSchemaProps> getAllOf() {
    return allOf;
  }

  public void setAllOf(List<V1beta1JSONSchemaProps> allOf) {
    this.allOf = allOf;
  }

  public V1beta1JSONSchemaProps anyOf(List<V1beta1JSONSchemaProps> anyOf) {
    this.anyOf = anyOf;
    return this;
  }

  public V1beta1JSONSchemaProps addAnyOfItem(V1beta1JSONSchemaProps anyOfItem) {
    if (this.anyOf == null) {
      this.anyOf = new ArrayList<V1beta1JSONSchemaProps>();
    }
    this.anyOf.add(anyOfItem);
    return this;
  }

   /**
   * Get anyOf
   * @return anyOf
  **/
  @ApiModelProperty(value = "")
  public List<V1beta1JSONSchemaProps> getAnyOf() {
    return anyOf;
  }

  public void setAnyOf(List<V1beta1JSONSchemaProps> anyOf) {
    this.anyOf = anyOf;
  }

  public V1beta1JSONSchemaProps _default(V1beta1JSON _default) {
    this._default = _default;
    return this;
  }

   /**
   * Get _default
   * @return _default
  **/
  @ApiModelProperty(value = "")
  public V1beta1JSON getDefault() {
    return _default;
  }

  public void setDefault(V1beta1JSON _default) {
    this._default = _default;
  }

  public V1beta1JSONSchemaProps definitions(Map<String, V1beta1JSONSchemaProps> definitions) {
    this.definitions = definitions;
    return this;
  }

  public V1beta1JSONSchemaProps putDefinitionsItem(String key, V1beta1JSONSchemaProps definitionsItem) {
    if (this.definitions == null) {
      this.definitions = new HashMap<String, V1beta1JSONSchemaProps>();
    }
    this.definitions.put(key, definitionsItem);
    return this;
  }

   /**
   * Get definitions
   * @return definitions
  **/
  @ApiModelProperty(value = "")
  public Map<String, V1beta1JSONSchemaProps> getDefinitions() {
    return definitions;
  }

  public void setDefinitions(Map<String, V1beta1JSONSchemaProps> definitions) {
    this.definitions = definitions;
  }

  public V1beta1JSONSchemaProps dependencies(Map<String, V1beta1JSONSchemaPropsOrStringArray> dependencies) {
    this.dependencies = dependencies;
    return this;
  }

  public V1beta1JSONSchemaProps putDependenciesItem(String key, V1beta1JSONSchemaPropsOrStringArray dependenciesItem) {
    if (this.dependencies == null) {
      this.dependencies = new HashMap<String, V1beta1JSONSchemaPropsOrStringArray>();
    }
    this.dependencies.put(key, dependenciesItem);
    return this;
  }

   /**
   * Get dependencies
   * @return dependencies
  **/
  @ApiModelProperty(value = "")
  public Map<String, V1beta1JSONSchemaPropsOrStringArray> getDependencies() {
    return dependencies;
  }

  public void setDependencies(Map<String, V1beta1JSONSchemaPropsOrStringArray> dependencies) {
    this.dependencies = dependencies;
  }

  public V1beta1JSONSchemaProps description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public V1beta1JSONSchemaProps _enum(List<V1beta1JSON> _enum) {
    this._enum = _enum;
    return this;
  }

  public V1beta1JSONSchemaProps addEnumItem(V1beta1JSON _enumItem) {
    if (this._enum == null) {
      this._enum = new ArrayList<V1beta1JSON>();
    }
    this._enum.add(_enumItem);
    return this;
  }

   /**
   * Get _enum
   * @return _enum
  **/
  @ApiModelProperty(value = "")
  public List<V1beta1JSON> getEnum() {
    return _enum;
  }

  public void setEnum(List<V1beta1JSON> _enum) {
    this._enum = _enum;
  }

  public V1beta1JSONSchemaProps example(V1beta1JSON example) {
    this.example = example;
    return this;
  }

   /**
   * Get example
   * @return example
  **/
  @ApiModelProperty(value = "")
  public V1beta1JSON getExample() {
    return example;
  }

  public void setExample(V1beta1JSON example) {
    this.example = example;
  }

  public V1beta1JSONSchemaProps exclusiveMaximum(Boolean exclusiveMaximum) {
    this.exclusiveMaximum = exclusiveMaximum;
    return this;
  }

   /**
   * Get exclusiveMaximum
   * @return exclusiveMaximum
  **/
  @ApiModelProperty(value = "")
  public Boolean isExclusiveMaximum() {
    return exclusiveMaximum;
  }

  public void setExclusiveMaximum(Boolean exclusiveMaximum) {
    this.exclusiveMaximum = exclusiveMaximum;
  }

  public V1beta1JSONSchemaProps exclusiveMinimum(Boolean exclusiveMinimum) {
    this.exclusiveMinimum = exclusiveMinimum;
    return this;
  }

   /**
   * Get exclusiveMinimum
   * @return exclusiveMinimum
  **/
  @ApiModelProperty(value = "")
  public Boolean isExclusiveMinimum() {
    return exclusiveMinimum;
  }

  public void setExclusiveMinimum(Boolean exclusiveMinimum) {
    this.exclusiveMinimum = exclusiveMinimum;
  }

  public V1beta1JSONSchemaProps externalDocs(V1beta1ExternalDocumentation externalDocs) {
    this.externalDocs = externalDocs;
    return this;
  }

   /**
   * Get externalDocs
   * @return externalDocs
  **/
  @ApiModelProperty(value = "")
  public V1beta1ExternalDocumentation getExternalDocs() {
    return externalDocs;
  }

  public void setExternalDocs(V1beta1ExternalDocumentation externalDocs) {
    this.externalDocs = externalDocs;
  }

  public V1beta1JSONSchemaProps format(String format) {
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  @ApiModelProperty(value = "")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public V1beta1JSONSchemaProps id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public V1beta1JSONSchemaProps items(V1beta1JSONSchemaPropsOrArray items) {
    this.items = items;
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(value = "")
  public V1beta1JSONSchemaPropsOrArray getItems() {
    return items;
  }

  public void setItems(V1beta1JSONSchemaPropsOrArray items) {
    this.items = items;
  }

  public V1beta1JSONSchemaProps maxItems(Long maxItems) {
    this.maxItems = maxItems;
    return this;
  }

   /**
   * Get maxItems
   * @return maxItems
  **/
  @ApiModelProperty(value = "")
  public Long getMaxItems() {
    return maxItems;
  }

  public void setMaxItems(Long maxItems) {
    this.maxItems = maxItems;
  }

  public V1beta1JSONSchemaProps maxLength(Long maxLength) {
    this.maxLength = maxLength;
    return this;
  }

   /**
   * Get maxLength
   * @return maxLength
  **/
  @ApiModelProperty(value = "")
  public Long getMaxLength() {
    return maxLength;
  }

  public void setMaxLength(Long maxLength) {
    this.maxLength = maxLength;
  }

  public V1beta1JSONSchemaProps maxProperties(Long maxProperties) {
    this.maxProperties = maxProperties;
    return this;
  }

   /**
   * Get maxProperties
   * @return maxProperties
  **/
  @ApiModelProperty(value = "")
  public Long getMaxProperties() {
    return maxProperties;
  }

  public void setMaxProperties(Long maxProperties) {
    this.maxProperties = maxProperties;
  }

  public V1beta1JSONSchemaProps maximum(Double maximum) {
    this.maximum = maximum;
    return this;
  }

   /**
   * Get maximum
   * @return maximum
  **/
  @ApiModelProperty(value = "")
  public Double getMaximum() {
    return maximum;
  }

  public void setMaximum(Double maximum) {
    this.maximum = maximum;
  }

  public V1beta1JSONSchemaProps minItems(Long minItems) {
    this.minItems = minItems;
    return this;
  }

   /**
   * Get minItems
   * @return minItems
  **/
  @ApiModelProperty(value = "")
  public Long getMinItems() {
    return minItems;
  }

  public void setMinItems(Long minItems) {
    this.minItems = minItems;
  }

  public V1beta1JSONSchemaProps minLength(Long minLength) {
    this.minLength = minLength;
    return this;
  }

   /**
   * Get minLength
   * @return minLength
  **/
  @ApiModelProperty(value = "")
  public Long getMinLength() {
    return minLength;
  }

  public void setMinLength(Long minLength) {
    this.minLength = minLength;
  }

  public V1beta1JSONSchemaProps minProperties(Long minProperties) {
    this.minProperties = minProperties;
    return this;
  }

   /**
   * Get minProperties
   * @return minProperties
  **/
  @ApiModelProperty(value = "")
  public Long getMinProperties() {
    return minProperties;
  }

  public void setMinProperties(Long minProperties) {
    this.minProperties = minProperties;
  }

  public V1beta1JSONSchemaProps minimum(Double minimum) {
    this.minimum = minimum;
    return this;
  }

   /**
   * Get minimum
   * @return minimum
  **/
  @ApiModelProperty(value = "")
  public Double getMinimum() {
    return minimum;
  }

  public void setMinimum(Double minimum) {
    this.minimum = minimum;
  }

  public V1beta1JSONSchemaProps multipleOf(Double multipleOf) {
    this.multipleOf = multipleOf;
    return this;
  }

   /**
   * Get multipleOf
   * @return multipleOf
  **/
  @ApiModelProperty(value = "")
  public Double getMultipleOf() {
    return multipleOf;
  }

  public void setMultipleOf(Double multipleOf) {
    this.multipleOf = multipleOf;
  }

  public V1beta1JSONSchemaProps not(V1beta1JSONSchemaProps not) {
    this.not = not;
    return this;
  }

   /**
   * Get not
   * @return not
  **/
  @ApiModelProperty(value = "")
  public V1beta1JSONSchemaProps getNot() {
    return not;
  }

  public void setNot(V1beta1JSONSchemaProps not) {
    this.not = not;
  }

  public V1beta1JSONSchemaProps oneOf(List<V1beta1JSONSchemaProps> oneOf) {
    this.oneOf = oneOf;
    return this;
  }

  public V1beta1JSONSchemaProps addOneOfItem(V1beta1JSONSchemaProps oneOfItem) {
    if (this.oneOf == null) {
      this.oneOf = new ArrayList<V1beta1JSONSchemaProps>();
    }
    this.oneOf.add(oneOfItem);
    return this;
  }

   /**
   * Get oneOf
   * @return oneOf
  **/
  @ApiModelProperty(value = "")
  public List<V1beta1JSONSchemaProps> getOneOf() {
    return oneOf;
  }

  public void setOneOf(List<V1beta1JSONSchemaProps> oneOf) {
    this.oneOf = oneOf;
  }

  public V1beta1JSONSchemaProps pattern(String pattern) {
    this.pattern = pattern;
    return this;
  }

   /**
   * Get pattern
   * @return pattern
  **/
  @ApiModelProperty(value = "")
  public String getPattern() {
    return pattern;
  }

  public void setPattern(String pattern) {
    this.pattern = pattern;
  }

  public V1beta1JSONSchemaProps patternProperties(Map<String, V1beta1JSONSchemaProps> patternProperties) {
    this.patternProperties = patternProperties;
    return this;
  }

  public V1beta1JSONSchemaProps putPatternPropertiesItem(String key, V1beta1JSONSchemaProps patternPropertiesItem) {
    if (this.patternProperties == null) {
      this.patternProperties = new HashMap<String, V1beta1JSONSchemaProps>();
    }
    this.patternProperties.put(key, patternPropertiesItem);
    return this;
  }

   /**
   * Get patternProperties
   * @return patternProperties
  **/
  @ApiModelProperty(value = "")
  public Map<String, V1beta1JSONSchemaProps> getPatternProperties() {
    return patternProperties;
  }

  public void setPatternProperties(Map<String, V1beta1JSONSchemaProps> patternProperties) {
    this.patternProperties = patternProperties;
  }

  public V1beta1JSONSchemaProps properties(Map<String, V1beta1JSONSchemaProps> properties) {
    this.properties = properties;
    return this;
  }

  public V1beta1JSONSchemaProps putPropertiesItem(String key, V1beta1JSONSchemaProps propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<String, V1beta1JSONSchemaProps>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @ApiModelProperty(value = "")
  public Map<String, V1beta1JSONSchemaProps> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, V1beta1JSONSchemaProps> properties) {
    this.properties = properties;
  }

  public V1beta1JSONSchemaProps required(List<String> required) {
    this.required = required;
    return this;
  }

  public V1beta1JSONSchemaProps addRequiredItem(String requiredItem) {
    if (this.required == null) {
      this.required = new ArrayList<String>();
    }
    this.required.add(requiredItem);
    return this;
  }

   /**
   * Get required
   * @return required
  **/
  @ApiModelProperty(value = "")
  public List<String> getRequired() {
    return required;
  }

  public void setRequired(List<String> required) {
    this.required = required;
  }

  public V1beta1JSONSchemaProps title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public V1beta1JSONSchemaProps type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public V1beta1JSONSchemaProps uniqueItems(Boolean uniqueItems) {
    this.uniqueItems = uniqueItems;
    return this;
  }

   /**
   * Get uniqueItems
   * @return uniqueItems
  **/
  @ApiModelProperty(value = "")
  public Boolean isUniqueItems() {
    return uniqueItems;
  }

  public void setUniqueItems(Boolean uniqueItems) {
    this.uniqueItems = uniqueItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1JSONSchemaProps v1beta1JSONSchemaProps = (V1beta1JSONSchemaProps) o;
    return Objects.equals(this.ref, v1beta1JSONSchemaProps.ref) &&
        Objects.equals(this.schema, v1beta1JSONSchemaProps.schema) &&
        Objects.equals(this.additionalItems, v1beta1JSONSchemaProps.additionalItems) &&
        Objects.equals(this.additionalProperties, v1beta1JSONSchemaProps.additionalProperties) &&
        Objects.equals(this.allOf, v1beta1JSONSchemaProps.allOf) &&
        Objects.equals(this.anyOf, v1beta1JSONSchemaProps.anyOf) &&
        Objects.equals(this._default, v1beta1JSONSchemaProps._default) &&
        Objects.equals(this.definitions, v1beta1JSONSchemaProps.definitions) &&
        Objects.equals(this.dependencies, v1beta1JSONSchemaProps.dependencies) &&
        Objects.equals(this.description, v1beta1JSONSchemaProps.description) &&
        Objects.equals(this._enum, v1beta1JSONSchemaProps._enum) &&
        Objects.equals(this.example, v1beta1JSONSchemaProps.example) &&
        Objects.equals(this.exclusiveMaximum, v1beta1JSONSchemaProps.exclusiveMaximum) &&
        Objects.equals(this.exclusiveMinimum, v1beta1JSONSchemaProps.exclusiveMinimum) &&
        Objects.equals(this.externalDocs, v1beta1JSONSchemaProps.externalDocs) &&
        Objects.equals(this.format, v1beta1JSONSchemaProps.format) &&
        Objects.equals(this.id, v1beta1JSONSchemaProps.id) &&
        Objects.equals(this.items, v1beta1JSONSchemaProps.items) &&
        Objects.equals(this.maxItems, v1beta1JSONSchemaProps.maxItems) &&
        Objects.equals(this.maxLength, v1beta1JSONSchemaProps.maxLength) &&
        Objects.equals(this.maxProperties, v1beta1JSONSchemaProps.maxProperties) &&
        Objects.equals(this.maximum, v1beta1JSONSchemaProps.maximum) &&
        Objects.equals(this.minItems, v1beta1JSONSchemaProps.minItems) &&
        Objects.equals(this.minLength, v1beta1JSONSchemaProps.minLength) &&
        Objects.equals(this.minProperties, v1beta1JSONSchemaProps.minProperties) &&
        Objects.equals(this.minimum, v1beta1JSONSchemaProps.minimum) &&
        Objects.equals(this.multipleOf, v1beta1JSONSchemaProps.multipleOf) &&
        Objects.equals(this.not, v1beta1JSONSchemaProps.not) &&
        Objects.equals(this.oneOf, v1beta1JSONSchemaProps.oneOf) &&
        Objects.equals(this.pattern, v1beta1JSONSchemaProps.pattern) &&
        Objects.equals(this.patternProperties, v1beta1JSONSchemaProps.patternProperties) &&
        Objects.equals(this.properties, v1beta1JSONSchemaProps.properties) &&
        Objects.equals(this.required, v1beta1JSONSchemaProps.required) &&
        Objects.equals(this.title, v1beta1JSONSchemaProps.title) &&
        Objects.equals(this.type, v1beta1JSONSchemaProps.type) &&
        Objects.equals(this.uniqueItems, v1beta1JSONSchemaProps.uniqueItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ref, schema, additionalItems, additionalProperties, allOf, anyOf, _default, definitions, dependencies, description, _enum, example, exclusiveMaximum, exclusiveMinimum, externalDocs, format, id, items, maxItems, maxLength, maxProperties, maximum, minItems, minLength, minProperties, minimum, multipleOf, not, oneOf, pattern, patternProperties, properties, required, title, type, uniqueItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1JSONSchemaProps {\n");
    
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    additionalItems: ").append(toIndentedString(additionalItems)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    allOf: ").append(toIndentedString(allOf)).append("\n");
    sb.append("    anyOf: ").append(toIndentedString(anyOf)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    definitions: ").append(toIndentedString(definitions)).append("\n");
    sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    _enum: ").append(toIndentedString(_enum)).append("\n");
    sb.append("    example: ").append(toIndentedString(example)).append("\n");
    sb.append("    exclusiveMaximum: ").append(toIndentedString(exclusiveMaximum)).append("\n");
    sb.append("    exclusiveMinimum: ").append(toIndentedString(exclusiveMinimum)).append("\n");
    sb.append("    externalDocs: ").append(toIndentedString(externalDocs)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    maxItems: ").append(toIndentedString(maxItems)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    maxProperties: ").append(toIndentedString(maxProperties)).append("\n");
    sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
    sb.append("    minItems: ").append(toIndentedString(minItems)).append("\n");
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
    sb.append("    minProperties: ").append(toIndentedString(minProperties)).append("\n");
    sb.append("    minimum: ").append(toIndentedString(minimum)).append("\n");
    sb.append("    multipleOf: ").append(toIndentedString(multipleOf)).append("\n");
    sb.append("    not: ").append(toIndentedString(not)).append("\n");
    sb.append("    oneOf: ").append(toIndentedString(oneOf)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    patternProperties: ").append(toIndentedString(patternProperties)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uniqueItems: ").append(toIndentedString(uniqueItems)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

