package com.xworkz.twitter.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NamedNativeQuery;

import javax.persistence.*;

@Entity
@Table(name="twitter_tb")
@Data
@AllArgsConstructor
@NoArgsConstructor
@NamedNativeQuery(name = "readALL",query = "select * from twitter_tb where name=:username",resultClass = TwitterEntity.class)
@NamedQueries({
        @NamedQuery(name="read",query = "select entities from TwitterEntity entities where entities.name=:name"),
        @NamedQuery(name="twitter",query = "select n from TwitterEntity n")

})

@NamedNativeQuery(name = "data",query = "select * from twitter_tb where  phoneNumber=:mobile_number and email=:email_id",resultClass = TwitterEntity.class)


@NamedQuery(name="chat",query = "select c from TwitterEntity c where c.phoneNumber=:phoneNumber and c.name=:name")

@NamedNativeQuery(name="vi",query = "select * from twitter_tb where phoneNumber=:mobile_Number and email=:email_Id",resultClass = TwitterEntity.class)


public class TwitterEntity {
    @Id
   //@Column(name="user_name")
    private String name;
    private String email;
    private long phoneNumber;
}
