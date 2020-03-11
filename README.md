# typhonml

[![Build Status](http://typhon.clmsuk.com:8080/buildStatus/icon?job=TyphonML)](http://typhon.clmsuk.com:8080/job/TyphonML)

## TyphonML manuals can be found at the following wiki link:

[Wiki](https://github.com/typhon-project/typhonml/wiki)

or to deliverables:

[Deliverable 2.4](https://github.com/typhon-project/internal-material/tree/master/WP2/D2.4)

## List of functions and features:

- TyphonML enables the specification of data entities and relationships that will be stored in different and heterogeneous databases.
- TyphonML enables the specification of data models by means of both textual and graphical syntaxes.
- Facilities for generating CRUD APIs from data models specified in TyphonML is provided.
- Specification of data types that are needed for applying text-specific analysis is supported.
- The specification of functional and non-functional requirements that will instruct the
deployment and querying of the modelled data models are supported.
- TyphonML supporting tools detect inconsistent data models (e.g. data entities in relational databases that refer to inexistent collections in document-based data models).
- TyphonML supporting tools provide modellers with early feedback about the specified data models (i.e. deployment feasibility of the modelled data with respect to the actual resource availabilities).

---

## Current development status

- Definition of custom data types to be used in TyphonML data models.
- Integration with DL
- Integration with QL

---

## List of future functions and features we are going to implement.

- Integration with DL. It is necessary to have from them the information regarding the databases that they are able to manage in order, therefore, to design the consistent TyphonML instance.
- Integration with QL. Integration with them is required as we do the generation of microservices at the moment, but it is necessary for the QL to have control over the APIs generated.
