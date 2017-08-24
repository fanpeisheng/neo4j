package org.neo4j.cypher.internal.frontend.v3_3.ast

import org.neo4j.cypher.internal.frontend.v3_3.{InputPosition, SemanticCheck, SemanticCheckResult, SemanticCheckable, SemanticChecking}

final case class GraphRef(name: Variable)(val position: InputPosition)
  extends ASTNode with ASTParticle with SemanticCheckable with SemanticChecking {

  override def semanticCheck: SemanticCheck =
    name.semanticCheck(Expression.SemanticContext.Simple)
}



