type fact =
  | At of entity * Common.filename (* readable path *) * int (* line *)
  | Kind of entity * Database_code.entity_kind
  | Extends of string * string
  | Call of entity * entity
  | Misc of string

  and entity = 
   string list (* package/module/namespace/class qualifier*) * string (* name *)

val string_of_fact: fact -> string

(* reused in other modules which generate prolog facts *)
val string_of_entity_kind: Database_code.entity_kind -> string

val build: Common.dirname -> Graph_code.graph -> fact list
