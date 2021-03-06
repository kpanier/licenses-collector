/*******************************************************************************
 * Copyright (c) 2017 Karsten Panier and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Karsten Panier - initial API and implementation
 *******************************************************************************/
package org.aysada.licensescollector.dependencies.impl;

import java.util.List;

import org.aysada.licensescollector.dependencies.BuildTool;
import org.aysada.licensescollector.dependencies.model.BuildFile;
import org.aysada.licensescollector.dependencies.model.BuildToolType;
import org.aysada.licensescollector.dependencies.model.Dependency;

public class MavenBuildTool implements BuildTool {

	@Override
	public boolean isBuildFile(String fileName) {
		if (fileName.equals("pom.xml")) {
			return true;
		}
		return false;
	}

	@Override
	public BuildToolType getType() {
		return BuildToolType.MAVEN;
	}

	@Override
	public List<Dependency> getDependencies(BuildFile buildFile) {
		// TODO Auto-generated method stub
		return null;
	}

}
