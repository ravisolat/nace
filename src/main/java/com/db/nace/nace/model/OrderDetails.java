package com.db.nace.nace.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(collection = "OrderDetails")
public class OrderDetails {

@Id
String order;
Integer level;
String code;
String parent;
String description;
String includes;
String alsoIncludes;
String rulings;
String excludes;
String reference;

}
