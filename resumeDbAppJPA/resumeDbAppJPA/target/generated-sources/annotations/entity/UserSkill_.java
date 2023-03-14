package entity;

import com.company.entity.Skill;
import com.company.entity.User;
import com.company.entity.UserSkill;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-03-13T01:43:52", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(UserSkill.class)
public class UserSkill_ { 

    public static volatile SingularAttribute<UserSkill, Skill> skillId;
    public static volatile SingularAttribute<UserSkill, Integer> id;
    public static volatile SingularAttribute<UserSkill, Integer> power;
    public static volatile SingularAttribute<UserSkill, User> userId;

}