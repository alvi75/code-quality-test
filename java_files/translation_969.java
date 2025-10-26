ublic DeleteAttributesRequest(String domainName, String itemName, List<Attribute> attributes, UpdateCondition expected) {
    setDomainName(domainName);
    setItemName(itemName);
    setAttributes(attributes);
    setExpected(expected);
}