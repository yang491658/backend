package project.blobus.Backend.youth.education;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "youth_education_policy")
@Getter
@Setter
@NoArgsConstructor
public class EducationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "policy_id")
    private int policyId; // 교육 정책 테이블 고유 ID값

    @Column(name = "biz_id", nullable = false)
    private String bizId; // 정책에 대한 ID 값

    @Column(name = "policy_name", nullable = false)
    private String policyName; // 정책명

    @Column(name = "policy_overview", columnDefinition = "TEXT", nullable = false)
    private String policyOverview; // 정책 소개

    @Column(name = "policy_content1", columnDefinition = "TEXT")
    private String policyContent1; // 정책 상세 내용 (지원 내용)

    @Column(name = "support_scale")
    private String supportScale; // 지원 규모

    @Column(name = "policy_operate_period")
    private String policyOperatePeriod; // 사업 운영 기간(api에서 넘어오는 오리지날 값)

    @Column(name = "policy_date_type")
    private int policyDateType; // 사업신청기간반복구분코드

    @Column(name = "policy_application_start_period")
    private LocalDate policyApplicationStartPeriod; // 사업 신청 시작 기간(목록에서만 보여줄 이쁜 값들, DBeaver에서 직접 수정할거임)

    @Column(name = "policy_application_end_period")
    private LocalDate policyApplicationEndPeriod; // 사업 신청 끝나는 기간(목록에서만 보여줄 이쁜 값들, DBeaver에서 직접 수정할거임)

    @Column(name = "policy_application_period")
    private String policyApplicationPeriod; // 사업 신청 기간

    @Column(name = "age_requirement")
    private String ageRequirement; // 연령 요건

    @Column(name = "proposer_requirement", columnDefinition = "TEXT")
    private String proposerRequirement; // 거주지 및 소득

    @Column(name = "academic_background")
    private String academicBackground; // 학력

    @Column(name = "major_in")
    private String majorIn; // 전공

    @Column(name = "employment_status")
    private String employmentStatus; // 취업 상태

    @Column(name = "additional_requirement", columnDefinition = "TEXT")
    private String additionalRequirement; // 추가 필요 사항

    @Column(name = "participation_restriction", columnDefinition = "TEXT")
    private String participationRestriction; // 참여 제한 대상

    @Column(name = "application_procedure", columnDefinition = "TEXT")
    private String applicationProcedure; // 신청 절차 내용

    @Column(name = "judging_presentation", columnDefinition = "TEXT")
    private String judgingPresentation; // 심사 및 발표

    @Column(name = "application_site", length = 2083)
    private String applicationSite; // 신청 사이트

    @Column(name = "submition_document", columnDefinition = "TEXT")
    private String submitionDocument; // 제출 서류 내용

    @Column(name = "host_organization")
    private String hostOrganization; // 주관 기관

    @Column(name = "hst_org_manager_name")
    private String hstOrgManagerName; // 주관 기관 담당자 이름

    @Column(name = "hst_org_manager_phone")
    private String hstOrgManagerPhone; // 주관 기관 담당자 연락처

    @Column(name = "operating_agency")
    private String operatingAgency; // 운영 기관

    @Column(name = "oper_agen_manager_name")
    private String operAgenManagerName; // 운영 기관 담당자 이름

    @Column(name = "oper_agen_manager_phone")
    private String operAgenManagerPhone; // 운영 기관 담당자 연락처

    @Column(name = "reference_site1", length = 2083)
    private String referenceSite1; // 참고사이트1

    @Column(name = "reference_site2", length = 2083)
    private String referenceSite2; // 참고사이트2

    @Column(name = "etc", columnDefinition = "TEXT")
    private String etc; // 기타사항

    @Column(name = "del_Flag")
    private boolean delFlag;

}
