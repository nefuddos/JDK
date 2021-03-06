/*
 * Copyright (c) 2003, 2015, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package com.sun.tools.doclets.internal.toolkit;

import java.io.*;
import java.util.*;

import com.sun.javadoc.*;

/**
 * The interface for writing constants summary output.
 *
 *  <p><b>This is NOT part of any supported API.
 *  If you write code that depends on this, you do so at your own risk.
 *  This code and its internal interfaces are subject to change or
 *  deletion without notice.</b>
 *
 * @author Jamie Ho
 * @author Bhavesh Patel (Modified)
 * @since 1.5
 */

@Deprecated
public interface ConstantsSummaryWriter {

    /**
     * Close the writer.
     */
    public abstract void close() throws IOException;

    /**
     * Get the header for the constant summary documentation.
     *
     * @return header that needs to be added to the documentation
     */
    public abstract Content getHeader();

    /**
     * Get the header for the constant content list.
     *
     * @return content header that needs to be added to the documentation
     */
    public abstract Content getContentsHeader();

    /**
     * Adds the given package name link to the constant content list tree.
     *
     * @param pkg                    the {@link PackageDoc} to index.
     * @param parsedPackageName      the parsed package name.  We only Write the
     *                               first 2 directory levels of the package
     *                               name. For example, java.lang.ref would be
     *                               indexed as java.lang.*.
     * @param WriteedPackageHeaders the set of package headers that have already
     *                              been indexed.  We don't want to index
     *                              something more than once.
     * @param contentListTree the content tree to which the link will be added
     */
    public abstract void addLinkToPackageContent(PackageDoc pkg, String parsedPackageName,
        Set<String> WriteedPackageHeaders, Content contentListTree);

    /**
     * Add the content list to the documentation tree.
     *
     * @param contentTree the tree to which the contents list will be added
     * @param contentListTree the content that will be added to the list
     */
    public abstract void addContentsList(Content contentTree, Content contentListTree);

    /**
     * Get the constant summaries for the document.
     *
     * @return constant summaries header to be added to the documentation tree
     */
    public abstract Content getConstantSummaries();

    /**
     * Adds the given package name.
     *
     * @param parsedPackageName the parsed package name.  We only Write the
     *                          first 2 directory levels of the package
     *                          name. For example, java.lang.ref would be
     *                          indexed as java.lang.*.
     * @param summariesTree the summaries documentation tree
     * @param first true if the first package is listed
     *                    be written
     */
    public abstract void addPackageName(String parsedPackageName, Content summariesTree, boolean first);

    /**
     * Get the class summary header for the constants summary.
     *
     * @return the header content for the class constants summary
     */
    public abstract Content getClassConstantHeader();

    /**
     * Add the content list to the documentation summaries tree.
     *
     * @param summariesTree the tree to which the class constants list will be added
     * @param classConstantTree the class constant tree that will be added to the list
     */
    public abstract void addClassConstant(Content summariesTree, Content classConstantTree);

    /**
     * Adds the constant member table to the documentation tree.
     *
     * @param cd the class whose constants are being documented.
     * @param fields the constants being documented.
     * @param classConstantTree the documentation tree to which theconstant member
     *                    table content will be added
     */
    public abstract void addConstantMembers(ClassDoc cd, List<FieldDoc> fields,
            Content classConstantTree);

    /**
     * Add the summaries list to the content tree.
     *
     * @param contentTree the tree to which the summaries list will be added
     * @param summariesTree the summaries content tree that will be added to the list
     */
    public abstract void addConstantSummaries(Content contentTree, Content summariesTree);

    /**
     * Adds the footer for the summary documentation.
     *
     * @param contentTree content tree to which the footer will be added
     */
    public abstract void addFooter(Content contentTree);

    /**
     * Print the constants summary document.
     *
     * @param contentTree content tree which should be printed
     */
    public abstract void printDocument(Content contentTree) throws IOException;

}
