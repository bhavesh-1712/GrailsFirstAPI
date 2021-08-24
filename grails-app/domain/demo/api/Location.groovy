package demo.api

class Location {
    Long id
    String streetAddress
    String streetAddressLine2
    String postalCode
    String stateProvince
    Float lat
    Float lon

    static belongsTo = [city: City]

    static constraints = {
        streetAddressLine2 nullable: true
        postalCode nullable: true
        stateProvince nullable: true
        lat nullable: true
        lon nullable: true
    }

    static mapping = {
        version false
    }
}
