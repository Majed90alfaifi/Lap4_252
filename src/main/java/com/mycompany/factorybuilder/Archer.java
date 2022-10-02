
package com.mycompany.factorybuilder;

public class Archer implements Characters{
    private String name;
    private Avatar avatar;
    
    public Archer(String name){
        if (name == null ) {
            throw new IllegalArgumentException("Character must have a name");
        }
        this.name=name;
        // TODO: instantiate an avatar builder using Avatar.Builder
        this.avatar=new Avatar.Builder(SkinTone.FAIR)
                .withHairColor(HairColor.BLOND)
                .withHairType(HairType.LONG_STRAIGHT)
                .withBodyType(BodyType.FIT)
                .withFacialFeatures(FacialFeatures.CLEAN_SHAVEN)
                .build();

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public Avatar getAvatar() {
        return null;
    }

    @Override
    public void setAvatar(Avatar avatar) {

    }
}
